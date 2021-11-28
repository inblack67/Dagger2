package com.example.di

import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels,
    val seat: ISeat
) {
    fun drive() {
//        println(engine)
//        println(wheels)
        println("driving the car of seat type ${seat.getSeatType()}")
    }

    @Inject // method injection
    fun enableRemote(remote: Remote) {
        remote.connectRemote(this) // will be called when the ctor is finished
    }
}

class Engine @Inject constructor() {
    fun start(){
        println("starting the engine...")
    }
}

class Remote @Inject constructor() {
    fun connectRemote(car: Car) {
        println("remote connected...")
    }
}

class MyMain{
    @Inject lateinit var car: Car
    fun run(){
//        val carComponent = DaggerICarComponent.create()
//        carComponent.inject(this)
//        car.engine.start()
//        car.drive()
    }
}

fun main(){
//    val myMain = MyMain()
//    myMain.run()

//    val carComponent = DaggerICarComponent.create()
    val seatPrice = 12.0
    val seatDiscount = 10.0
    val carComponent = DaggerICarComponent
        .builder()
        .price(seatPrice)
        .discount(seatDiscount)
        .build()
    val car = carComponent.getCarInstance()
    car.engine.start()
    car.drive()
}
