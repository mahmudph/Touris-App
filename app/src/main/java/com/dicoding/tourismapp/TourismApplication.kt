/**
 * Created by Mahmud on 09/01/23.
 * mahmud120398@gmail.com
 */

package com.dicoding.tourismapp

import android.app.Application
import com.dicoding.tourismapp.di.useCaseModule
import com.dicoding.tourismapp.di.viewModelModule
import com.example.core.di.databaseModule
import com.example.core.di.networkModule
import com.example.core.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level


class TourismApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@TourismApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule,
                )
            )
        }
    }
}