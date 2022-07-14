package com.ghtk.network.client

import com.ghtk.network.response.Module

class GCabinetService : IService {
    override suspend fun getCabinet(mac: String): Result<Module> {

    }

    companion object {
        const val API_GET_CABINET = "/v1/smart-lock/init"
    }
}
