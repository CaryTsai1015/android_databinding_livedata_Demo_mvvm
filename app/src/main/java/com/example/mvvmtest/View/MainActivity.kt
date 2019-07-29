package com.example.mvvmtest.View

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation.findNavController

//import com.example.mvvmtest.MainViewModel
import com.example.mvvmtest.R
import com.example.mvvmtest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        val mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
//
//        binding.viewModel = mainViewModel
//        binding.lifecycleOwner = this
//
//        mainViewModel.loadData()
//
//        binding.btVm.setOnClickListener {
//
//
//            mainViewModel.loadData()
//
//
//        }
    }


    override fun onSupportNavigateUp() =
        findNavController(this, R.id.my_nav_host_fragment).navigateUp()

}
