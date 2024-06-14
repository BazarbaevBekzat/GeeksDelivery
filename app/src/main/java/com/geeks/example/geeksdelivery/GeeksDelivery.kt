package com.geeks.example.geeksdelivery

import android.app.Application
import com.geeks.example.geeksdelivery.data.module.networkModule
import com.geeks.example.geeksdelivery.data.module.repoModule
import com.geeks.example.geeksdelivery.domain.module.useCaseModule
import com.myself223.geeksdelivery.presentation.module.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class GeeksDelivery:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@GeeksDelivery)
            modules(networkModule, repoModule, useCaseModule, uiModule)
        }
    }


}