package com.example.datetimepicker

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var btnDate: Button
    private lateinit var btnTime: Button
    private lateinit var tvDate: TextView
    private lateinit var tvTime: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDate = findViewById(R.id.btnDate)
        btnTime = findViewById(R.id.btnTime)
        tvDate = findViewById(R.id.tvDate)
        tvTime = findViewById(R.id.tvTime)

        btnDate.setOnClickListener {
            val calendar = Calendar.getInstance()

            DatePickerDialog(
                this,
                { _, year, month, dayOfMonth ->
                    val date = "$dayOfMonth/${month + 1}/$year"
                    tvDate.text = "Date: $date"
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        btnTime.setOnClickListener {
            val calendar = Calendar.getInstance()

            TimePickerDialog(
                this,
                { _, hourOfDay, minute ->
                    val time = String.format(Locale.getDefault(), "%02d:%02d", hourOfDay, minute)
                    tvTime.text = "Time: $time"
                },
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                true
            ).show()
        }
    }
}