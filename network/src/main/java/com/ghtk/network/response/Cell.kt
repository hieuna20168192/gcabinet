package com.ghtk.network.response

import com.google.gson.annotations.SerializedName

data class Cell(
    @SerializedName("cell_id") var cellId: String? = "",
    @SerializedName("cell_name") var cellName: String? = "",
    @SerializedName("cell_no") var cellNo: Int? = -1,
    @SerializedName("packages") var packages: ArrayList<Package> = arrayListOf(),
    @SerializedName("status") var status: String? = ""
)
