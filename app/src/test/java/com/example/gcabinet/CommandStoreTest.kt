package com.example.gcabinet

import org.junit.Test

import org.junit.Assert.*

class CommandStoreTest {

    private val commandStore = CommandStore()

    @Test
    fun hexStrCmd_lockId0_box0_returnAAEB22020000B955() {

        val actualCmd = commandStore.hexStrCmd("0", "0")
        assertEquals("AAEB22020000B955", actualCmd)
    }
}
