package com.example.myapplication

import com.google.gson.annotations.SerializedName
import java.io.Serializable

//data class myModel(val id:Int, val name :String ,val loc:String) {
//}
data class imgLocModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("location")
    val location: String

) : Serializable