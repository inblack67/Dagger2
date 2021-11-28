package com.example.di

// third party library => private => constructors can not be injected via dagger => Modules & Providers
class Wheels (
    private val rim: Rim,
    private val tires: Tires
) {
}

class Rim {
    fun configureRim(){
        println("rim configured")
    }
}

class Tires {
    fun inflate() {
        println("tires inflated")
    }
}