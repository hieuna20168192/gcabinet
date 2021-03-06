package com.example.gcabinet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.ghtk.internal.utils.factory.DeviceAppFactory
import tp.xmaihh.serialport.bean.ComBean

class MainActivity : AppCompatActivity() {

    private val serialManager = SerialManager(object : OnDataReceived {
        override fun onReceive(param: ComBean) {
            runOnUiThread {
                // TODO: Convert to hexString later when stable
                findViewById<TextView>(R.id.tvReceivedMsg).text = param.toString()
            }
        }
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        serialManager.connect()

        findViewById<TextView>(R.id.tvLoc0).setOnClickListener {
            serialManager.sendHex("AAEB22020000B955")
        }

        findViewById<TextView>(R.id.tvLoc1).setOnClickListener {
            serialManager.sendHex("AAEB22020100BA55")
        }

        findViewById<TextView>(R.id.tvReadAll).setOnClickListener {
            serialManager.sendHex("AAEB230100B955")
        }
    }
}
