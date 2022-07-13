package com.example.gcabinet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val serialManager = SerialManager()

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
