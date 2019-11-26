package com.kotlin.dagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Maruti @Inject constructor(
    @Named("price") private var price: String,
    @Named("colour") private var colour: String
) : CarModel {

    private val TAG: String = "Maruti"

    override fun name() {
        Log.e(TAG, " this is Maruti car")
        getPrice()
        getColour()
    }

    fun getPrice() {
        Log.e(TAG, " Price of car is $price")
    }

    fun getColour() {
        Log.e(TAG, " Colour of car is $colour")
    }
}