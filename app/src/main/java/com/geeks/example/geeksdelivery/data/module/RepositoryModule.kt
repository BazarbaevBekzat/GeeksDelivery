package com.geeks.example.geeksdelivery.data.module

import com.geeks.example.geeksdelivery.data.remote.repository.CategoryRepositoryImpl
import com.geeks.example.geeksdelivery.domain.repository.CategoryRepository
import org.koin.dsl.module

val repoModule = module {
    single<CategoryRepository>{ CategoryRepositoryImpl(get()) }
}