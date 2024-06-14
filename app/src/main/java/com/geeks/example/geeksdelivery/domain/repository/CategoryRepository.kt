package com.geeks.example.geeksdelivery.domain.repository

import androidx.lifecycle.LiveData
import com.geeks.example.geeksdelivery.data.base.BaseMainResponse
import com.geeks.example.geeksdelivery.data.remote.dto.CategoryDto

interface CategoryRepository {
    fun getAllCategory():LiveData<BaseMainResponse<CategoryDto>?>
}