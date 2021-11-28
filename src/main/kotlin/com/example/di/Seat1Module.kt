package com.example.di

import dagger.Binds
import dagger.Module

@Module
abstract class Seat1Module {

    // use @Binds instead of @Provides when you just want to bind an implementation to an interface => as it's more concise & efficient
    @Binds // never creates implementation for this class and method => just instantiates the arg => Seat1
//    takes single arg => which is the implementation for the interface
//    since no implementation is created => can not use Provider methods as they needs instance of the module
//    but static provide methods can be used
    abstract fun bindSeat(seat1: Seat1) : ISeat

//    @Provides
//    fun provideSeat(seat1: Seat1) : ISeat {
//        return seat1
//    }
}