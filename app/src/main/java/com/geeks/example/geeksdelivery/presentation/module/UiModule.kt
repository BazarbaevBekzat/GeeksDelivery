package com.myself223.geeksdelivery.presentation.module

import com.geeks.example.geeksdelivery.presentation.ui.fragment.menu.MenuViewModel
import org.koin.dsl.module


val uiModule = module {
    single { MenuViewModel(get()) }
}