package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var activityViewModel: ActivityViewModel
    private val TAG = "MainActivity"
    var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        activityViewModel = ViewModelProvider(this).get(ActivityViewModel::class.java)

        activityViewModel.intValue.observe(this) {
            Log.e(TAG, "in intvalue $it")

        }
    }

    fun OnRedClick(){
        activityViewModel.change.setValue(2)

    }

    fun OnBlueClick(){
        activityViewModel.change.setValue(2)

    }
}