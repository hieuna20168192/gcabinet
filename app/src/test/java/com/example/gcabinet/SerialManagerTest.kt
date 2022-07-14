package com.example.gcabinet

import org.junit.Before
import org.junit.Test

// Unfortunately, No serial port support in Java.library
class SerialManagerTest {

    private lateinit var serialManager: SerialManager

    @Before
    fun setUp() {
        serialManager = SerialManager()
        serialManager.connect()
    }

    @Test
    fun send_CM_OPEN_openLock() {
        serialManager.sendHex("AAEB22020000B955")
    }
}
