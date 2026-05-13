package com.example.radio_button

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var radioGroup: RadioGroup? = null
    private lateinit var radioButton: RadioButton
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Display name of the application
        title = "RadioGroup in Kotlin"

        // Assigning id of RadioGroup
        radioGroup = findViewById(R.id.radioGroup1)

        // Assigning id of Submit button
        button = findViewById(R.id.submitButton)

        // Actions to be performed when Submit button is clicked
        button.setOnClickListener {

            // Getting the checked radio button id
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId

            // Assigning id of the checked radio button
            radioButton = findViewById(selectedOption)

            // Displaying text of the checked radio button
            Toast.makeText(
                baseContext,
                radioButton.text,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}