package com.geeks.example.geeksdelivery.domain.usecase

import androidx.lifecycle.LiveData
import com.geeks.example.geeksdelivery.data.base.BaseMainResponse
import com.geeks.example.geeksdelivery.data.remote.dto.CategoryDto
import com.geeks.example.geeksdelivery.domain.repository.CategoryRepository

class CategoryUseCase(private val repository: CategoryRepository) {
    operator fun invoke():LiveData<BaseMainResponse<CategoryDto>?>{
        return repository.getAllCategory()
    }
}