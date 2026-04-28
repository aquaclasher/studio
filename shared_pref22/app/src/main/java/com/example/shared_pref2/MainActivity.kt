package com.example.shared_pref2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var age: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        name = findViewById(R.id.edit1)
        age = findViewById(R.id.edit2)
    }

    // Fetch the stored data in onResume()
    override fun onResume() {
        super.onResume()

        val sh = getSharedPreferences("MySharedPref", MODE_PRIVATE)

        val s1 = sh.getString("name", "")
        val a = sh.getInt("age", 0)

        name.setText(s1)
        age.setText(a.toString())
    }

    // Store the data in SharedPreferences in onPause()
    override fun onPause() {
        super.onPause()

        val sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val myEdit = sharedPreferences.edit()

        myEdit.putString("name", name.text.toString())

        // Safer conversion to avoid crash if empty
        val ageValue = age.text.toString().toIntOrNull() ?: 0
        myEdit.putInt("age", ageValue)

        myEdit.apply()
    }
}