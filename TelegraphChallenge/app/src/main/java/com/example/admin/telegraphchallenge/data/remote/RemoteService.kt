package com.example.admin.telegraphchallenge.data.remote

import com.example.admin.telegraphchallenge.models.Response
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET

interface RemoteService {

    @GET("tmgmobilepub/articles.json")
    fun getPopularMovies(): Deferred<Response>
}