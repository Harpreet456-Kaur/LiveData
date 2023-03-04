package com.example.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityViewModel : ViewModel() {
    var text:MutableLiveData<String> = MutableLiveData("Abc")
    var intValue= MutableLiveData(1)
    var change = MutableLiveData(2)
}