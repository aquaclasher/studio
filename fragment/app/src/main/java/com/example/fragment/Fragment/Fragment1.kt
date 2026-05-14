package com.example.fragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment // Fixed: Changed from android.support.v4.app
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.R

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = Fragment1()
    }
}