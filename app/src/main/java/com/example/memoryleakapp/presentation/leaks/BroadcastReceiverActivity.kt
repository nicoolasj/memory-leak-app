package com.example.memoryleakapp.presentation.leaks

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.memoryleakapp.R


class BroadcastReceiverActivity : AppCompatActivity() {

    private var broadcastReceiver: BroadcastReceiver? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_receiver)
    }

    override fun onStart() {
        super.onStart()
        registerBroadCastReceiver()
    }

    private fun registerBroadCastReceiver() {
        broadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                Toast.makeText(
                    this@BroadcastReceiverActivity,
                    "Airplane mode changed",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        registerReceiver(
            broadcastReceiver,
            IntentFilter(IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED))
        )
    }

    override fun onDestroy() {
        super.onDestroy()
//        unregisterReceiver(broadcastReceiver)
//        leak will occur here if the broadcast receiver isn't unregistered from the activity
    }
}