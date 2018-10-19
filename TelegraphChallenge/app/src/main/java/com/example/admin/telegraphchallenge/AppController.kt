package com.example.admin.telegraphchallenge

import android.app.Application
import com.example.admin.telegraphchallenge.di.application.ApplicationComponent
import com.example.admin.telegraphchallenge.di.application.ApplicationModule
import com.example.admin.telegraphchallenge.di.application.DaggerApplicationComponent

class AppController : Application() {

    private lateinit var applicationComponent: ApplicationComponent

    fun getComponent(): ApplicationComponent {
        return if (this::applicationComponent.isInitialized) applicationComponent else createApplicationComponent()
    }

    private fun createApplicationComponent(): ApplicationComponent {
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(ApplicationModule()).build()
        return applicationComponent
    }
}