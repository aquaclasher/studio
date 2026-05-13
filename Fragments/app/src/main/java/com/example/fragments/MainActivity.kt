package com.example.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.example.fragments.*

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bf1 = findViewById<Button>(R.id.bf1)
        val bf2 = findViewById<Button>(R.id.bf2)

        bf1.setOnClickListener {
            goToFragment(Fragment1())
        }

        bf2.setOnClickListener {
            goToFragment(Fragment2())
        }
    }

    private fun goToFragment(fragment: Fragment) {
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}