package com.example.shahrytask.di

import com.example.shahrytask.data.repos.HomeRepoImp
import com.example.shahrytask.domain.repos.HomeRepo
import com.shahrytask.network.datasource.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ReposModule {

    /**
     * Repos
     */

    @Singleton
    @Provides
    fun provideHomeRepository(remoteDataSource: RemoteDataSource): HomeRepo =
        HomeRepoImp(remoteDataSource)


}