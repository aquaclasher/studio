package com.example.datepicker

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.app.DatePickerDialog
import android.support.v7.app.AppCompatActivity
import java.util.Calendar
import java.text.SimpleDateFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var btnDatePicker: Button
    private lateinit var tvSelectedDate: TextView
    private val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        btnDatePicker = findViewById(R.id.btnDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)

        // Button click
        btnDatePicker.setOnClickListener {
            showDatePicker()
        }
    }

    private fun showDatePicker() {

        val dateSetListener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->

            calendar.set(Calendar.YEAR, year)
            calendar.set(Calendar.MONTH, month)
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)

            updateDate()
        }

        DatePickerDialog(
            this,
            dateSetListener,
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        ).show()
    }

    private fun updateDate() {
        val format = SimpleDateFormat("dd/MM/yyyy", Locale.US)
        tvSelectedDate.text = format.format(calendar.time)
    }
}