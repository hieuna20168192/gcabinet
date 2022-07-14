package com.ghtk.network.response

import com.google.gson.annotations.SerializedName


data class Package(
    @SerializedName("added_date") var addedDate: String? = "",
    @SerializedName("alias") var alias: String? = "",
    @SerializedName("date_to_delay_deliver") var dateToDelayDeliver: String? = "",
    @SerializedName("delay_deliver_reason_code") var delayDeliverReasonCode: String? = "",
    @SerializedName("deliver_work_shift") var deliverWorkShift: Int? = -1,
    @SerializedName("package_dtatus_id") var packageDtatusId: Int? = -1,
    @SerializedName("pkg_order") var pkgOrder: Int? = -1
)
