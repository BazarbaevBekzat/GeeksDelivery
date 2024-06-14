package com.geeks.example.geeksdelivery.domain.module

import com.geeks.example.geeksdelivery.domain.usecase.CategoryUseCase
import org.koin.dsl.module


val useCaseModule = module {
    single { CategoryUseCase(get()) }
}