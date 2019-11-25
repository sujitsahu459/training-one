package com.kotlin.dagger

class Volume {
    private var volume: Int = 0

    fun setVolume(vol: Int) {
        volume = vol
    }

    fun getVolume(): Int = volume

}