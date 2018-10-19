package com.example.admin.telegraphchallenge.ui

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.admin.telegraphchallenge.AppController
import com.example.admin.telegraphchallenge.databinding.ActivityMainBinding
import com.example.admin.telegraphchallenge.di.activity.ActivityModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var activityMainBinding: ActivityMainBinding

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependencies()
        activityMainBinding.setLifecycleOwner(this)
        activityMainBinding.viewModel = mainViewModel
        mainViewModel.getPopularMovies().observe(this, Observer {
            recyclerView.apply {
                adapter = it
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        })
    }

    private fun injectDependencies() {
        (application as AppController).getComponent().newActivityComponent(ActivityModule(this)).inject(this)
    }
}
