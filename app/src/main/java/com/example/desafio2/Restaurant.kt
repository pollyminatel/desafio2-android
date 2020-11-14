package com.example.desafio2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurant(
    val photo: String,
    val name: String,
    val address: String,
    val closeDoors: String,
    val menu: MutableList<Dish>
) : Parcelable