package com.kotlin.dagger

import android.util.Log

/**
 * CarMusicPlayer: Suppose this class is created by any third party team.
 * and we dont have access to modify (@Inject constructor) in that case
 * if we want to use that class on out project we will provide this class
 * dependency in @Method module of dagger.
 */
class CarMusicPlayer(var volume: Volume) {

    private val TAG: String = "CarMusicPlayer"

    private var base: Int = 0

    fun setBase(base: Int) {
        this.base = base
    }

    fun getBase() {
        Log.e(TAG, "base volume is $base")
    }


    fun getVolume() {
        Log.e(TAG, "base volume is ${volume.getVolume()}")
    }

}