package com.shahrytask.network.datasource

import com.shahrytask.network.ApiServices
import javax.inject.Inject


class RemoteDataSourceImp @Inject constructor(private val apiServices: ApiServices) :
    RemoteDataSource {

    /**
     * APIS needed parameters getters.++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    //Header Parameters
    private fun getlanguage() = "ar"

    //Body Parameters
    private fun getDeviceToken() = ""
    private fun getDeviceID() = ""
    private fun getDeviceType() = "android"


    override suspend fun getAuthors() = apiServices.getAuthors()
    override suspend fun getPosts(
        authorId: Int,
        page: Int,
        perPage: Int
    ) = apiServices.getPosts(authorId,page,perPage)
}