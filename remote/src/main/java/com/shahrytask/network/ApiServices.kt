package com.shahrytask.network

import com.shahrytask.network.model.responses.AuthorModel
import retrofit2.Response
import retrofit2.http.GET


interface ApiServices {


    @GET("authors")
    suspend fun getAuthors(): Response<MutableList<AuthorModel>>


}