package com.example.activitylifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitylifecycle.R

class log_activity_life_cycle : AppCompatActivity() {
    private val tag = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_life_cycle)
        val msg = "onCreate"
        Log.d(tag , msg)
    }
    override fun onStart(){
        super.onStart()
        val msg = "onStart"
        Log.d(tag ,msg)
    }
    override fun onResume(){
        super.onResume()
        val msg = "onResume"
        Log.d(tag , msg)
    }
    override fun onPause(){
        super.onPause()
        val msg = "onPause"
        Log.d(tag,msg)
    }
    override fun onRestart(){
        super.onRestart()
        val msg = "onRestart"
        Log.d(tag,msg)
    }
    override fun onStop(){
        super.onStop()
        val msg = "onStop"
        Log.d(tag,msg)
    }

    override fun onDestroy() {
        super.onDestroy()
        val msg = "onDestroy"
        Log.d(tag, msg)
    }
}