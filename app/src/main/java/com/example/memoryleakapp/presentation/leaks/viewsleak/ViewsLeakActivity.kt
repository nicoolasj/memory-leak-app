package com.example.memoryleakapp.presentation.leaks.viewsleak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memoryleakapp.R

class ViewsLeakActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_views_leak)
    }
}