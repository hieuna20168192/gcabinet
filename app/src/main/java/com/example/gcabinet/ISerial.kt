package com.example.gcabinet

interface ISerial {
    fun connect()
    fun sendHex(hexStr: String)
}
