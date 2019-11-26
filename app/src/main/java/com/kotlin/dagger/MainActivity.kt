package com.kotlin.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.dagger.di.DaggerCarComponet
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var bike: Bike

    @Inject
    lateinit var carMusicPlayer: CarMusicPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponet = DaggerCarComponet.builder()
            .price("1000")
            .colour("Red")
            .build()
        carComponet.inject(this) // This process is call Field injection
//        var car = carComponet.getCar() // We can create the object like this
        car.drive()

        carMusicPlayer.setBase(10)

        carMusicPlayer.getBase()

        bike.bikeDrive()

    }


}
