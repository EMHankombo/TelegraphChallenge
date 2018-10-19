package com.example.admin.telegraphchallenge.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.example.admin.telegraphchallenge.adapters.PopularMoviesAdapter
import com.example.admin.telegraphchallenge.data.repository.Repository

class MainViewModel(private val repository: Repository) : ViewModel() {

    fun getPopularMovies(): LiveData<PopularMoviesAdapter> {
        return Transformations.map(repository.getPopularMovies()) {
            PopularMoviesAdapter(it.collection)
        }
    }
}