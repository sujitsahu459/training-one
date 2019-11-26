package com.kotlin.dagger.di

import com.kotlin.dagger.Car
import com.kotlin.dagger.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [MusicModule::class, MarutiCardModule::class])
interface CarComponet {

    fun getCar(): Car

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun price(@Named("price") price: String): Builder

        @BindsInstance
        fun colour(@Named("colour") colour: String): Builder

        fun build(): CarComponet

    }
}