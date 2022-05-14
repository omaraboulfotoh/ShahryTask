package com.shahrytask.network

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Factory class to create [Retrofit] via [createRetrofit].
 * Created by Mohamed Elshawaf .
 */
object RetrofitFactory {

    fun createRetrofit(baseUrl: BaseUrl, okHttpClient: OkHttpClient, moshi: Moshi): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl.url)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }
}
