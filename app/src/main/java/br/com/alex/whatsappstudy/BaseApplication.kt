package br.com.alex.whatsappstudy

import android.app.Application
import br.com.alex.whatsappstudy.core.CoreModule
import br.com.alex.whatsappstudy.di.ChatsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BaseApplication)
            modules(
                CoreModule.instance,
                ChatsModule.instance
            )
        }
    }
}