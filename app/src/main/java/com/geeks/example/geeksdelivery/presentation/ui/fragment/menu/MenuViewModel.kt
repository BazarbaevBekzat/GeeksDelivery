package com.geeks.example.geeksdelivery.presentation.ui.fragment.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.geeks.example.geeksdelivery.data.base.BaseMainResponse
import com.geeks.example.geeksdelivery.data.remote.dto.CategoryDto
import com.geeks.example.geeksdelivery.domain.usecase.CategoryUseCase
import kotlinx.coroutines.flow.MutableStateFlow

class MenuFragmentViewModel(
    private val categoryUseCase: CategoryUseCase
) : ViewModel() {

    private var _categories: LiveData<BaseMainResponse<CategoryDto>?> = MutableLiveData()
    val categories get() = _categories

    fun getAllCategory() {
        _categories = categoryUseCase()
    }
}