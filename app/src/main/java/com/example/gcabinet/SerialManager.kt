package com.example.gcabinet

import tp.xmaihh.serialport.SerialHelper

class SerialManager : ISerial {

    private val serialHelper: SerialHelper by lazy {
        SerialHelperImpl()
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
