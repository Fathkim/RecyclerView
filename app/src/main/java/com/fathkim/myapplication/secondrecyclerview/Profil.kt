package com.fathkim.myapplication.secondrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Profil(
    val desc: String,
    val image: String
):Parcelable
