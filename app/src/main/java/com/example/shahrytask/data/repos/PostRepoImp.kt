package com.example.shahrytask.data.repos

import android.util.Log
import androidx.annotation.WorkerThread
import com.example.shahrytask.domain.repos.PostRepo
import com.shahrytask.network.Result
import com.shahrytask.network.datasource.RemoteDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onStart
import org.json.JSONObject
import javax.inject.Inject

@WorkerThread
class PostRepoImp @Inject constructor(var remoteDataSource: RemoteDataSource) : PostRepo {
    override suspend fun getPosts(
        authorId: Int,
        page: Int,
        perPage: Int
    ) = flow {
        try {
            remoteDataSource.getPosts(authorId, page, perPage).let {
                if (it.isSuccessful) {
                    emit(Result.Success(it.body()!!))
                } else {
                    Log.e("error", it.errorBody()?.string()!!)
                    emit(
                        Result.Error(
                            mutableListOf(),
                            JSONObject(it.errorBody()?.string())["message"].toString()
                        )
                    )
                }
            }
        } catch (throwable: Throwable) {
            Log.e("error catch", throwable.message!!)
            emit(
                Result.Error(
                    mutableListOf(),
                    throwable.message
                )
            )
        }
    }.onStart { emit(Result.Loading()) }.flowOn(Dispatchers.IO)


}