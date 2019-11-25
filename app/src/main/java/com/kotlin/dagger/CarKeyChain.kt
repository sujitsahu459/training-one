package com.kotlin.dagger

/**
 * CarKeyChain: This is an interface and an interface can't have constructor so that
 * we cant inject this class directly
 */
interface CarKeyChain {

    fun keyChainColor()
}