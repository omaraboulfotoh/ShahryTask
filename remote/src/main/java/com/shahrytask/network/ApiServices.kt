package com.shahrytask.network

import com.shahrytask.network.model.responses.AuthorModel
import com.shahrytask.network.model.responses.PostModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiServices {


    @GET("authors")
    suspend fun getAuthors(): Response<MutableList<AuthorModel>>

    @GET("posts")
    suspend fun getPosts(
        @Query("authorId") authorId: Int,
        @Query("_page") page: Int,
        @Query("_limit") perPage: Int
    ): Response<MutableList<PostModel>>

}