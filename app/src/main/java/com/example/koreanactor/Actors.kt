package com.example.mysubmissionapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Actors(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0,
    var born: String = "",
    var drama: String = ""
) : Parcelable