package com.example.admin.telegraphchallenge.di.application

import android.arch.lifecycle.MutableLiveData
import com.example.admin.telegraphchallenge.models.Response
import dagger.Module
import dagger.Provides

@Module
class LiveDataModule {

    @Provides
    fun providesResponseMutableLiveData(): MutableLiveData<Response> = MutableLiveData()
}