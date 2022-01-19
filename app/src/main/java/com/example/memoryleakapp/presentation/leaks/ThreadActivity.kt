package com.example.memoryleakapp.presentation.leaks

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import com.example.memoryleakapp.R

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)
        DownloadTask().start()
    }

    fun start(context: Context) {
        val starter = Intent(context, ThreadActivity::class.java)
        context.startActivity(starter)
    }

    /**
     * non-static anonymous classes hold an implicit reference to their enclosing class.
     */
    private inner class DownloadTask : Thread() {
        override fun run() {
            SystemClock.sleep((5000 * 10).toLong())
        }
    }
}