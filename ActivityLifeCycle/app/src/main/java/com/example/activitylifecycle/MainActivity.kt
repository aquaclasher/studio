package com.example.activitylifecycle

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.button3)
        val b2 = findViewById<Button>(R.id.button4)

        b1.setOnClickListener {
            startActivity(Intent(this , log_activity_life_cycle::class.java))
            finish()
        }

        b2.setOnClickListener {
            startActivity(Intent(this ,toast_activity_cycle::class.java))
            finish()
        }
    }
}