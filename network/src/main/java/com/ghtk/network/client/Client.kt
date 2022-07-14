package com.ghtk.network.client

import com.ghtk.internal.repository.token.AuthenServiceImp

interface IClient {
    suspend fun <T> call(): Result<T>
}

class Client(
    private val url: String = ""
) : IClient {
    override suspend fun <T> call(): Result<T> {
        AuthenServiceImp.getInstance().doRequestNonCheckToken()
    }
}
