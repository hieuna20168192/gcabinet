package com.ghtk.network.result

sealed class GResult<T> {
    class Success<T> : GResult<T>()
    class Error(msg: String = "", code: Int = -1) : GResult<Any>()
}
