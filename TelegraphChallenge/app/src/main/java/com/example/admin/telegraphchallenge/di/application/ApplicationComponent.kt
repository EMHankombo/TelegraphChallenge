package com.example.admin.telegraphchallenge.di.application

import com.example.admin.telegraphchallenge.data.repository.RepositoryImpl
import com.example.admin.telegraphchallenge.di.activity.ActivityComponent
import com.example.admin.telegraphchallenge.di.activity.ActivityModule
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class, LiveDataModule::class])
interface ApplicationComponent {

    fun newActivityComponent(activityModule: ActivityModule): ActivityComponent

    fun getRepositoryImpl(): RepositoryImpl

}