package com.example.shahrytask.domain.usecases

import com.example.shahrytask.domain.repos.HomeRepo
import javax.inject.Inject

class GetHomeUseCase @Inject constructor(val homeRepo: HomeRepo) {

    suspend fun doHomeRequest() = homeRepo.doHome()
}