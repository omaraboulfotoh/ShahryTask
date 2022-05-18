package com.shahrytask.network.model.responses

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize


@Parcelize
@JsonClass(generateAdapter = true)
data class PostModel(

    @Json(name = "id")
    var id: Int = -1,
    @Json(name = "date")
    var date: String = "",
    @Json(name = "title")
    var title: String = "",
    @Json(name = "body")
    var body: String = "",
    @Json(name = "imageUrl")
    var imageUrl: String = "",
    @Json(name = "authorId")
    var authorId: Int = -1
) : Parcelable