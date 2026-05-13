package com.example.timepicker

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.TimePicker
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var timePicker: TimePicker
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timePicker = findViewById(R.id.timePicker)
        textView = findViewById(R.id.textView)

        showTime()
    }

    private fun showTime() {

        timePicker.setOnTimeChangedListener { _, hourOfDay, minute ->

            val time = String.format(Locale.getDefault(), "%02d:%02d", hourOfDay, minute)
            textView.text = "Selected Time: $time"
        }
    }
}