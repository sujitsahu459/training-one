package com.kotlin.dagger.di

import com.kotlin.dagger.CarMusicPlayer
import com.kotlin.dagger.Volume
import dagger.Module
import dagger.Provides

@Module
class MusicModule {

    @Provides
    fun provideVolume(): Volume = Volume()

    @Provides
    fun provideCarMusicPlayer(vol: Volume): CarMusicPlayer = CarMusicPlayer(vol)
}