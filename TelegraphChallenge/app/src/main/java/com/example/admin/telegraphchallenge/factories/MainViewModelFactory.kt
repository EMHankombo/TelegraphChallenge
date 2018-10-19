package com.example.admin.telegraphchallenge.factories

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.admin.telegraphchallenge.data.repository.RepositoryImpl
import com.example.admin.telegraphchallenge.ui.MainViewModel
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(val repository: RepositoryImpl) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) MainViewModel(repository) as T
        else throw IllegalArgumentException("ViewModel not found")
    }
}