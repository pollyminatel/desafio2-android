package com.example.desafio2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Dish(
    val photo: String,
    val name: String,
    val explanation: String
) : Parcelable