package com.example.admin.telegraphchallenge.di.application

import com.example.admin.telegraphchallenge.data.remote.RemoteServiceHelper
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    @ApplicationScope
    fun providesRemoteServiceHelper() = RemoteServiceHelper()
}