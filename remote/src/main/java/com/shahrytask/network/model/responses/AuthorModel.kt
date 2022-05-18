package com.shahrytask.network.model.responses

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class AuthorModel(
    
    @Json(name = "id")
    var id: Int = -1,
    @Json(name = "name")
    var name: String = "",
    @Json(name = "userName")
    var userName: String = "",
    @Json(name = "email")
    var email: String = "",
    @Json(name = "avatarUrl")
    var avatarUrl: String = "",
    @Json(name = "address")
    var address: AuthorAddress? = null
) : Parcelable


@Parcelize
@JsonClass(generateAdapter = true)
data class AuthorAddress(
    @Json(name = "latitude")
    var latitude: Double = 0.0,
    @Json(name = "longitude")
    var longitude: Double = 0.0,
) : Parcelable