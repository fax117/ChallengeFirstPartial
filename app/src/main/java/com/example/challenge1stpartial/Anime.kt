package edu.itesm.stanley

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Anime(
        val picture:Int,
        val titulo:String,
        val tipo: String,
        val anio: String,
        val plot: String,
        val rank: Int): Parcelable

