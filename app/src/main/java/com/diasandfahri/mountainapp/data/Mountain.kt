package com.diasandfahri.mountainapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mountain(
    val name: String = "",
    val location: String = "",
    val people: Int = 0,
    val description: String = "",
    val img: Int = 0,
    val popular: Int = 0,
    val nearest: Int = 0,
    val recommended: Int = 0
) : Parcelable