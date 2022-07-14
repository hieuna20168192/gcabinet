package com.ghtk.network.response

import com.google.gson.annotations.SerializedName


data class Data(
    @SerializedName("cabinet_id") var cabinetId: String? = "",
    @SerializedName("mac") var mac: String? = "",
    @SerializedName("modules") var modules: ArrayList<Module> = arrayListOf(),
    @SerializedName("name") var name: String? = "",
    @SerializedName("station_id") var stationId: Int? = -1,
    @SerializedName("status") var status: String? = ""
)
