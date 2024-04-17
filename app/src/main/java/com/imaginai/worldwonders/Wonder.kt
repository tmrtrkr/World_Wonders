package com.imaginai.worldwonders

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wonder(val name: String, val ImgW: Int): Parcelable