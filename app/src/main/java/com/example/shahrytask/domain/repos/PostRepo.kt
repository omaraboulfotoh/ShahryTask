package com.example.shahrytask.domain.repos

import com.shahrytask.network.Result
import com.shahrytask.network.model.responses.PostModel
import kotlinx.coroutines.flow.Flow

interface PostRepo {

    suspend fun getPosts(
        authorId: Int,
        page: Int,
        perPage: Int
    ): Flow<Result<MutableList<PostModel>>>
}