package com.kotlin.dagger

import android.util.Log
import javax.inject.Inject

class Bike @Inject constructor() {

    fun bikeDrive()
    {
        Log.e("Bike","Bike driving...")
    }

}