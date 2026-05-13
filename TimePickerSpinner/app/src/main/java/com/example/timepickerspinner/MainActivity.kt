package com.example.timepickerspinner

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TimePicker
import android.widget.Toast
import java.util.Locale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timePicker = findViewById<TimePicker>(R.id.timePicker)

        timePicker.setOnTimeChangedListener { _, hourOfDay, minute ->

            val amPm: String
            val hour = if (hourOfDay == 0) 12
            else if (hourOfDay > 12) hourOfDay - 12
            else hourOfDay

            amPm = if (hourOfDay >= 12) "PM" else "AM"

            val formattedHour = String.format(Locale.getDefault(), "%02d", hour)
            val formattedMinute = String.format(Locale.getDefault(), "%02d", minute)

            val msg = "Time is: $formattedHour:$formattedMinute $amPm"

            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }
    }
}