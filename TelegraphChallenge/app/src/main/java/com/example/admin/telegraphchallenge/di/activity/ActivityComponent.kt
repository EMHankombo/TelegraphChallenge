package com.example.admin.telegraphchallenge.di.activity

import com.example.admin.telegraphchallenge.factories.MainViewModelFactory
import com.example.admin.telegraphchallenge.ui.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun getMainViewModelFactory(): MainViewModelFactory

    fun inject(mainActivity: MainActivity)
}