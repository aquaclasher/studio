package com.example.explicit_intent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState:
                          Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Explicit Intent
        val explicitButton=findViewById<Button>(R.id.ExplicitButton)
        explicitButton.setOnClickListener {
            val explicitIntent= Intent(this,SecondActivity::class.java)
            startActivity(explicitIntent)
            finish()
        }
        val url ="https:</www.google.com"
        val ib=findViewById<Button>(R.id.B1)
        ib.setOnClickListener {//Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
            startActivity(implicitIntent)
        }
    }
}