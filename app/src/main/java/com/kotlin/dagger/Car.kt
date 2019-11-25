package com.kotlin.dagger

import android.util.Log
import javax.inject.Inject

/**
 * @Inject: This will always execute first
 * Order of Dependency injection is -
 * 1. Constructor injection
 * 2. Field Injection
 * 3. Method Injection
 */
class Car @Inject constructor(engine: Engine, carModel: CarModel) {
    private val engine: Engine = engine
    private val carModel: CarModel = carModel

    /**
     * This is Field Injection and it will be called after constructor Injection
     */
    @Inject
    lateinit var wheel: Wheel

    /**
     * This function will call after Field  injection
     */
    @Inject
    fun carRemove(remote: CarRemote) {
        remote.listener(this)
    }

    fun drive() {
        carModel.name()
        Log.e("car", "I am drving ")
    }

}