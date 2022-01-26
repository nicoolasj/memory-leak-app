package com.example.memoryleakapp.presentation.leaks

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.memoryleakapp.R

class ThreadActivity : AppCompatActivity() {

    private var thread: DownloadTask? = DownloadTask()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)
        thread?.start()
    }

    override fun onDestroy() {
        super.onDestroy()
//        thread?.interrupt()
    }

    /**
     * non-static anonymous classes hold an implicit reference to their enclosing class.
     */
    private inner class DownloadTask : Thread() {
        override fun run() {
            Log.d("leak", "start logging")
            while (!isInterrupted) {
                Log.d("leak", "logging")
            }
            if (isInterrupted)
                Log.d("leak", "stop logging")
        }
    }
}