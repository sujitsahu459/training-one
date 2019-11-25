package com.kotlin.dagger.di

import com.kotlin.dagger.CarModel
import com.kotlin.dagger.Hundai
import dagger.Module
import dagger.Provides

@Module
class CarHundaiModule(private var price: String) {

    @Provides
    fun providePrice(): String {
        return price
    }

    @Provides
    fun provideCarModel(hundai: Hundai): CarModel = hundai
}