package com.example.explicit_intent2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
class SecondActivity : AppCompatActivity() {
    override fun onCreate(
        savedInstanceState:
        Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //get data from intent
        val intent = intent
        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")
        val phone = intent.getStringExtra("Phone")
        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)
        //setText
        resultTv.text = "Name: " + name + "\nEmail:"+email+"\nPhone: "+phone
    }
}