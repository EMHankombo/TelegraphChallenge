package com.example.admin.telegraphchallenge.di.activity

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import com.example.admin.telegraphchallenge.R
import com.example.admin.telegraphchallenge.databinding.ActivityMainBinding
import com.example.admin.telegraphchallenge.factories.MainViewModelFactory
import com.example.admin.telegraphchallenge.ui.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val appCompatActivity: AppCompatActivity) {

    @Provides
    @ActivityScope
    fun getMainViewModel(mainViewModelFactory: MainViewModelFactory) =
        ViewModelProviders.of(appCompatActivity, mainViewModelFactory).get(MainViewModel::class.java)

    @Provides
    @ActivityScope
    fun getMainActivityBinding(): ActivityMainBinding = DataBindingUtil.setContentView(appCompatActivity, R.layout.activity_main)
}