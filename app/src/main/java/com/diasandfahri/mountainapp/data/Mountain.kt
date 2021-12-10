package com.diasandfahri.mountainapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mountain(
    val name: String = "",
    val locationStringRes: Int = 0,
    val people: Int = 0,
    val descriptionStringRes: Int = 0,
    val img: Int = 0,
    val popular: Int = 0,
    val nearest: Int = 0,
    val recommended: Int = 0
) : Parcelable