package com.teamtalento.housyappbeta.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mansion(
    val id:Int,
    val name: String,
    val address: String,
    val officeHours: String,
    val photo: String,
    val history: String
) : Parcelable

