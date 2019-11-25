package com.kotlin.dagger

import android.util.Log
import javax.inject.Inject

/**
 * @Inject : Is important because without this dagger not understand
 * to Create the Object of this class
 */
class CarRemote @Inject constructor() {

    val TAG: String = "CarRemove"

    fun listener(car: Car) {
        Log.e(TAG, "Car remove insert ")
    }
}