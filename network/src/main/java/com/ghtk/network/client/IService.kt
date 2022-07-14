package com.ghtk.network.client

import com.ghtk.network.response.Module

interface IService {
    suspend fun getCabinet(mac: String): Result<Module>
}
