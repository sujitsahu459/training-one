package com.kotlin.dagger.di

import com.kotlin.dagger.Car
import com.kotlin.dagger.MainActivity
import dagger.Component

@Component(modules = [MusicModule::class, CarHundaiModule::class])
interface CarComponet {

    fun getCar(): Car

    fun inject(activity: MainActivity)
}