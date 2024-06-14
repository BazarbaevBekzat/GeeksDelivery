package com.geeks.example.geeksdelivery.data.remote.apiservice

import com.geeks.example.geeksdelivery.data.base.BaseMainResponse
import com.geeks.example.geeksdelivery.data.remote.dto.CategoryDto
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getAllCategory(): Response<BaseMainResponse<CategoryDto>>
}