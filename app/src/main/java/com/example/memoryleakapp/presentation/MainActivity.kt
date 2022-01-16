package com.example.memoryleakapp.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.memoryleakapp.databinding.ActivityMainBinding
import com.example.memoryleakapp.presentation.leaks.BroadcastReceiverActivity
import com.example.memoryleakapp.presentation.leaks.ThreadActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setView()
    }

    private fun setView() = binding.run {
        asyncTaskButton.setOnClickListener { showToast() }
        staticAsyncTaskButton.setOnClickListener { showToast() }
        threadButton.setOnClickListener {
            Intent(
                this@MainActivity,
                ThreadActivity::class.java
            ).also { startActivity(it) }
        }
        handlerButton.setOnClickListener { showToast() }
        singletonButton.setOnClickListener { showToast() }
        listenerButton.setOnClickListener { showToast() }
        broadcastReceiverButton.setOnClickListener {
            Intent(
                this@MainActivity,
                BroadcastReceiverActivity::class.java
            ).also { startActivity(it) }
        }
        staticActivityOrViewButton.setOnClickListener { showToast() }
        innerClassButton.setOnClickListener { showToast() }
        anonymousClassButton.setOnClickListener { showToast() }
        timerTaskButton.setOnClickListener { showToast() }
    }

    private fun showToast() =
        Toast.makeText(this@MainActivity, "not implemented", Toast.LENGTH_SHORT).show()
}