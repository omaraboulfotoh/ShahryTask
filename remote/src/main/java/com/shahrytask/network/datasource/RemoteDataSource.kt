package com.shahrytask.network.datasource

import com.shahrytask.network.model.responses.AuthorModel
import com.shahrytask.network.model.responses.PostModel
import retrofit2.Response

interface RemoteDataSource {

    suspend fun getAuthors(): Response<MutableList<AuthorModel>>
    suspend fun getPosts(
        authorId: Int,
        page: Int,
        perPage: Int
    ): Response<MutableList<PostModel>>
}