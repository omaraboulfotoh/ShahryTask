package com.example.shahrytask.di

import com.example.shahrytask.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.shahrytask.network.BaseUrl
import com.shahrytask.network.OkHttpClientFactory
import com.shahrytask.network.OptionsListDeserializer
import com.shahrytask.network.RetrofitFactory
import com.shahrytask.network.model.OptionsList
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideBaseUrl() = BaseUrl(BuildConfig.BASE_URL)


    @Provides
    @Singleton
    fun provideMoshi(): Moshi = Moshi.Builder().build()


    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClientFactory.createOkHttpClient(
            isDebug = BuildConfig.DEBUG,
            sslSocket = null
        )
    }

    @Provides
    @Singleton
    fun providesGson(): Gson {
        return GsonBuilder()
            .setLenient()
            .registerTypeAdapter(OptionsList::class.java, OptionsListDeserializer())
            .serializeNulls()
            .create()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        baseUrl: BaseUrl,
        okHttpClient: OkHttpClient,
        moshi: Moshi
    ): Retrofit {
        return RetrofitFactory.createRetrofit(
            baseUrl = baseUrl,
            okHttpClient = okHttpClient,
            moshi = moshi
        )
    }
}
