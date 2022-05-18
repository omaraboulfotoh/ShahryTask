package com.example.shahrytask.ui.posts

import androidx.lifecycle.ViewModel
import com.example.shahrytask.data.local.ds.PrefersStore
import com.example.shahrytask.domain.usecases.GetPostsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthorPostViewModel @Inject constructor(
    var useCase: GetPostsUseCase,
    var prefersStore: PrefersStore
) : ViewModel() {

    suspend fun doPostsRequest(
        authorId: Int,
        page: Int
    ) = useCase.doPostsRequest(authorId, page, 10)

}