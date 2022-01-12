package com.example.memoryleakapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memoryleakapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}