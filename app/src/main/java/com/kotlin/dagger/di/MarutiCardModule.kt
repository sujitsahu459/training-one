package com.kotlin.dagger.di

import com.kotlin.dagger.CarModel
import com.kotlin.dagger.Maruti
import dagger.Module
import dagger.Provides

@Module
class MarutiCardModule {

    @Provides
    fun provideCarModel(): CarModel = Maruti()
}