package com.example.shahrytask.di

import android.content.Context
import com.example.shahrytask.data.local.ds.PrefersStore
import com.example.shahrytask.data.local.ds.PrefersStoreImp
import com.shahrytask.network.ApiServices
import com.shahrytask.network.datasource.RemoteDataSource
import com.shahrytask.network.datasource.RemoteDataSourceImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiServices =
        retrofit.create(ApiServices::class.java)

    @Singleton
    @Provides
    fun provideRemoteDataSource(remoteApiServices: ApiServices): RemoteDataSource =
        RemoteDataSourceImp(remoteApiServices)

    @Singleton
    @Provides
    fun provideDataStore(@ApplicationContext appContext: Context): PrefersStore =
        PrefersStoreImp(appContext)
}