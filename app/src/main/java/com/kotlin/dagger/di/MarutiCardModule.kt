package com.kotlin.dagger.di

import com.kotlin.dagger.CarModel
import com.kotlin.dagger.Maruti
import dagger.Binds
import dagger.Module

@Module
abstract class MarutiCardModule {

    @Binds
    abstract fun bindCarModel(maruti: Maruti): CarModel
}