package com.geeks.example.geeksdelivery.data.remote.dto

import com.google.gson.annotations.SerializedName
import java.io.Serial

data class CategoryDto(
    @SerializedName("idCategory")
    val id :String? = null,
    @SerializedName("StrCategory")
    val name:String? = null,
    @SerializedName("strCategoryThumb")
    val thumbCategory:String? = null,
    @SerializedName("strCategoryDescription")
    val categoryDesc:String? = null
)
