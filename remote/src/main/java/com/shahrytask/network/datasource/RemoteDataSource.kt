package com.shahrytask.network.datasource

import com.shahrytask.network.model.responses.AuthorModel
import retrofit2.Response

interface RemoteDataSource {

    suspend fun getAuthors(): Response<MutableList<AuthorModel>>
}