package com.example.autocomplete

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {

    private val fruits = arrayOf(
        "Apple", "Banana", "Cherry", "Date",
        "Grape", "Kiwi", "Mango", "Pear"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "KotlinApp"

        val autoTextView: AutoCompleteTextView = findViewById(R.id.text)

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            fruits
        )

        autoTextView.threshold = 1
        autoTextView.setAdapter(adapter)
    }
}