package com.example.di

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class Seat2Module(
    val price: Double
) {

//    now, dagger knows where to get price value
//    will depend on datatype (Double, here), which could cause ambiguity (Multiple Double bindings) so use @Named => check Seat1Module
    @Provides
    fun providePrice() : Double {
        return price
    }

    @Provides
    fun provideSeat(seat2: Seat2) : ISeat {
       return seat2
    }


//    @Provides
//    fun provideSeat() : ISeat {
//        return Seat2(price)
//    }

//    @Binds // => does not support any configuration
//    abstract fun bindSeat(seat2: Seat2) : ISeat
}