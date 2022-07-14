package com.ghtk.network.response

import com.google.gson.annotations.SerializedName


data class CabinetResult(
    @SerializedName("data") var data: Data? = Data(),
    @SerializedName("message") var message: String? = "",
    @SerializedName("success") var success: Boolean? = false
)
