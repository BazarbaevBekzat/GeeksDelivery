package com.geeks.example.geeksdelivery.data.remote.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.geeks.example.geeksdelivery.data.base.BaseMainResponse
import com.geeks.example.geeksdelivery.data.remote.apiservice.ApiService
import com.geeks.example.geeksdelivery.data.remote.dto.CategoryDto
import com.geeks.example.geeksdelivery.domain.repository.CategoryRepository
import kotlinx.coroutines.Dispatchers

class CategoryRepositoryImpl(private val api: ApiService): CategoryRepository {
    override fun getAllCategory(): LiveData<BaseMainResponse<CategoryDto>?> = liveData(Dispatchers.IO){
        val data = api.getAllCategory()
        if (data.isSuccessful) {
            data.body()?.let {emit(it)}
        }else {
            Log.e("ololo", "ololo")
        }
    }
}