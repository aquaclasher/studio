package com.example.customtoast

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast = findViewById(R.id.btnToast)

        btnToast.setOnClickListener(View.OnClickListener {
            val inflater = layoutInflater
            val layout = inflater.inflate(R.layout.custom_toast, null)

            val text = layout.findViewById<TextView>(R.id.toastText)
            text.text = "Hello! This is Custom Toast"

            val toast = Toast(applicationContext)
            toast.duration = Toast.LENGTH_SHORT
            toast.view = layout
            toast.show()
        })
    }
}