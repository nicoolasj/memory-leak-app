package com.example.memoryleakapp.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.memoryleakapp.databinding.ActivityMainBinding
import com.example.memoryleakapp.presentation.leaks.BroadcastReceiverActivity
import com.example.memoryleakapp.presentation.leaks.StaticReferenceActivity
import com.example.memoryleakapp.presentation.leaks.ThreadActivity
import com.example.memoryleakapp.presentation.leaks.viewsleak.ViewsLeakActivity

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
        threadButton.setOnClickListener { openActivity(ThreadActivity::class.java) }
        handlerButton.setOnClickListener { showToast() }
        singletonButton.setOnClickListener { showToast() }
        listenerButton.setOnClickListener { showToast() }
        broadcastReceiverButton.setOnClickListener { openActivity(BroadcastReceiverActivity::class.java) }
        staticActivityOrViewButton.setOnClickListener { openActivity(StaticReferenceActivity::class.java) }
        innerClassButton.setOnClickListener { showToast() }
        anonymousClassButton.setOnClickListener { showToast() }
        timerTaskButton.setOnClickListener { showToast() }
        viewsLeakButton.setOnClickListener { openActivity(ViewsLeakActivity::class.java) }
    }

    private fun <T: Any> openActivity(cls: Class<T>) =
        Intent(this, cls).also { startActivity(it) }

    private fun showToast() =
        Toast.makeText(this@MainActivity, "not implemented", Toast.LENGTH_SHORT).show()
}