package com.demo.cat.model.breedlistresponse


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Weight(
    @Json(name = "imperial")
    val imperial: String?,
    @Json(name = "metric")
    val metric: String?
)