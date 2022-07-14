package com.ghtk.network.response

import com.google.gson.annotations.SerializedName

data class Module(
    @SerializedName("cells") var cells: ArrayList<Cell> = arrayListOf(),
    @SerializedName("horizontal_cell") var horizontalCell: Int? = -1,
    @SerializedName("horizontal_ratio") var horizontalRatio: ArrayList<Int> = arrayListOf(),
    @SerializedName("module_id") var moduleId: String? = "",
    @SerializedName("module_type") var moduleType: String? = "",
    @SerializedName("vertical_cell") var verticalCell: Int? = -1,
    @SerializedName("vertical_ratio") var verticalRatio: ArrayList<Int> = arrayListOf()
)
