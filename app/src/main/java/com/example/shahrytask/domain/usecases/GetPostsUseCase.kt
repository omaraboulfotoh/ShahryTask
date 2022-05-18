package com.example.shahrytask.domain.usecases

import com.example.shahrytask.domain.repos.PostRepo
import javax.inject.Inject

class GetPostsUseCase @Inject constructor(val postRepo: PostRepo) {

    suspend fun doPostsRequest(
        authorId: Int,
        page: Int,
        perPage: Int
    ) = postRepo.getPosts(authorId, page, perPage)
}