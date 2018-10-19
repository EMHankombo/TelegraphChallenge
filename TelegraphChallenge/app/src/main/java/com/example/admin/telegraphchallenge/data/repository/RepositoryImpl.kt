package com.example.admin.telegraphchallenge.data.repository

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.example.admin.telegraphchallenge.data.remote.RemoteServiceHelper
import com.example.admin.telegraphchallenge.models.Response
import kotlinx.coroutines.experimental.CoroutineExceptionHandler
import kotlinx.coroutines.experimental.launch
import retrofit2.HttpException
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val remoteServiceHelper: RemoteServiceHelper,
    val popularMoviesLiveData: MutableLiveData<Response>
) : Repository {


    override fun getPopularMovies(): MutableLiveData<Response> {
        val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
            if (throwable is HttpException) {
                //TODO implement exception handling
                Log.d("Main", "In HttpException")

            } else {
                //TODO implement exception handling
                Log.d("Main", "In other error", throwable.fillInStackTrace())
            }
        }

        launch(exceptionHandler) {
            val popularMoviesResponse = remoteServiceHelper.getPopularMovies().await()
            popularMoviesLiveData.postValue(popularMoviesResponse)
        }
        return popularMoviesLiveData
    }
}