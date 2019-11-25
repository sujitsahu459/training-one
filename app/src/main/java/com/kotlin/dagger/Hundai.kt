package com.kotlin.dagger

import android.util.Log
import javax.inject.Inject

class Hundai @Inject constructor(private var price: String) : CarModel {

    private val TAG: String = "Hundai"

    override fun name() {
        Log.e(TAG, " this is Hundai car")
        getPrice()
    }

    fun getPrice() {
        Log.e(TAG, " Price of car is $price")
    }
}