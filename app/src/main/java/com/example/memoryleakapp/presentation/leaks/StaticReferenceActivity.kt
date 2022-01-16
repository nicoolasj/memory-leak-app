package com.example.memoryleakapp.presentation.leaks

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.memoryleakapp.R

class StaticReferenceActivity : AppCompatActivity() {

    companion object {
        private lateinit var leakTextView: TextView
        private lateinit var activity: Activity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_reference)
        leakTextView = findViewById(R.id.leakTextView)
        leakTextView.text = "Isso pode causar um vazamento de memória!"
        activity = this
    }
}