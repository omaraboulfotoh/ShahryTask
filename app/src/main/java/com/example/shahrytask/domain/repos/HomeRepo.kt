package com.example.shahrytask.domain.repos

import com.shahrytask.network.Result
import com.shahrytask.network.model.responses.AuthorModel
import kotlinx.coroutines.flow.Flow

interface HomeRepo {

    suspend fun doHome(): Flow<Result<MutableList<AuthorModel>>>
}