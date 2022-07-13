package com.example.gcabinet

import tp.xmaihh.serialport.SerialHelper

class SerialManager(
    private val received: OnDataReceived = OnDataReceived.NULL
) : ISerial {

    private val serialHelper: SerialHelper by lazy {
        SerialHelperImpl(received)
    }

    override fun connect() {
        if (!serialHelper.isOpen) {
            serialHelper.open()
        }
    }

    override fun sendHex(hexStr: String) {
        if (serialHelper.isOpen) {
            serialHelper.sendHex(hexStr)
        }
    }
}
