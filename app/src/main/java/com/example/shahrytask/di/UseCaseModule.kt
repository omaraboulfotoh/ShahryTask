package com.example.shahrytask.di

import com.example.shahrytask.domain.repos.HomeRepo
import com.example.shahrytask.domain.repos.PostRepo
import com.example.shahrytask.domain.usecases.GetHomeUseCase
import com.example.shahrytask.domain.usecases.GetPostsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    /**
     * All UseCases
     */


    @Provides
    fun providesGetHomeUseCase(homeRepo: HomeRepo) = GetHomeUseCase(homeRepo)

    @Provides
    fun providesGetPostsUseCase(postRepo: PostRepo) = GetPostsUseCase(postRepo)

}