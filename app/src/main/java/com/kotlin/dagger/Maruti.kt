package com.kotlin.dagger

import android.util.Log
import javax.inject.Inject

class Maruti @Inject constructor() : CarModel {

    private val TAG: String = "Maruti"

    override fun name() {
        Log.e(TAG, " this is maruti car")
    }
}