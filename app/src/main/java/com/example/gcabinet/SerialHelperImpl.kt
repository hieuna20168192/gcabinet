package com.example.gcabinet

import android.util.Log
import tp.xmaihh.serialport.SerialHelper
import tp.xmaihh.serialport.bean.ComBean

internal class SerialHelperImpl(
    private val received: OnDataReceived = OnDataReceived.NULL
) : SerialHelper(Contract.PORT, Contract.BAUD_RATE) {

    init {
        dataBits = Contract.DATA_BIT
        parity = Contract.PARITY
        stopBits = Contract.STOP_BIT
    }

    override fun onDataReceived(paramComBean: ComBean?) {
        // Nothing can take place
        Log.d("onDataReceived", paramComBean.toString())
        paramComBean?.let { received.onReceive(it) }
    }
}

interface OnDataReceived {
    fun onReceive(param: ComBean)

    companion object {
        val NULL = object : OnDataReceived {
            override fun onReceive(param: ComBean) = Unit
        }
    }
}
