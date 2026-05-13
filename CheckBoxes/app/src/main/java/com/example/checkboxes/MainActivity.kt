package com.example.checkboxes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var pizza: CheckBox
    lateinit var coffee: CheckBox
    lateinit var burger: CheckBox
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pizza = findViewById(R.id.checkBox1)
        coffee = findViewById(R.id.checkBox2)
        burger = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)

        button.setOnClickListener {

            var totalAmount = 0
            val result = StringBuilder()

            result.append("Selected Items:\n")

            if (pizza.isChecked) {
                result.append("Pizza : 100Rs\n")
                totalAmount += 100
            }

            if (coffee.isChecked) {
                result.append("Coffee : 50Rs\n")
                totalAmount += 50
            }

            if (burger.isChecked) {
                result.append("Burger : 120Rs\n")
                totalAmount += 120
            }

            result.append("\nTotal: $totalAmount Rs")

            Toast.makeText(
                applicationContext,
                result.toString(),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}