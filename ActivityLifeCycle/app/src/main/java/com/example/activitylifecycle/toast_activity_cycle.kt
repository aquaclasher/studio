package com.example.activitylifecycle


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class toast_activity_cycle : AppCompatActivity() {
    private val tag = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_cycle)
        val msg = "onCreate method call"
        Log.d(tag , msg)
        Toast.makeText(applicationContext , "onCreate" , Toast.LENGTH_LONG).show()
    }
    override fun onRestart(){
        super.onRestart()
        val msg = "onRestart method call"
        Log.d(tag , msg)
        Toast.makeText(applicationContext , "onRestart" , Toast.LENGTH_LONG).show()
    }
    override fun onDestroy(){
        super.onDestroy()
        val msg = "onDestroy method call"
        Log.d(tag,msg)
        Toast.makeText(applicationContext , "onDestroy" , Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        val msg = "onPause method call"
        Log.d(tag,msg)
        Toast.makeText(applicationContext , "onPause" , Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        val msg = "onResume method call"
        Log.d(tag,msg)
        Toast.makeText(applicationContext , "onResume" , Toast.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        val msg = "onStop method call"
        Log.d(tag,msg)
        Toast.makeText(applicationContext , "onStop" , Toast.LENGTH_LONG).show()
    }
}