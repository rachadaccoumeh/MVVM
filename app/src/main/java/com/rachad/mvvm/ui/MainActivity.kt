package com.rachad.mvvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.rachad.mvvm.R
import com.rachad.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val nameViewModel: NameViewModel = ViewModelProvider(this)[NameViewModel::class.java]
        binding.nameViewModel=nameViewModel
        binding.lifecycleOwner = this
        /*nameViewModel.mutableLiveData.observe(this) {
            binding.textView.text = it
        }*/
        /*binding.button.setOnClickListener {
            nameViewModel.getMovieName()
        }*/


    }


}