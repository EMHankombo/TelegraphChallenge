package com.example.admin.telegraphchallenge.data.repository

import android.arch.lifecycle.MutableLiveData
import com.example.admin.telegraphchallenge.models.Response

interface Repository {

    fun getPopularMovies() : MutableLiveData<Response>
}