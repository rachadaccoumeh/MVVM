package com.rachad.mvvm.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rachad.mvvm.pojo._____Model

class NameViewModel : ViewModel() {
    val mutableLiveData: MutableLiveData<String> = MutableLiveData()
    private fun get____ModelFromDatabase(): _____Model {
        return _____Model("__name", "---description", 1)
    }

    public fun getMovieName() {
        mutableLiveData.value = get____ModelFromDatabase().name
    }

}