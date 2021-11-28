package com.example.di

import javax.inject.Inject

// no inject constructor as price can not be provided at compile time
class Seat2 @Inject constructor(
    val price: Double
) : ISeat {
    override fun getSeatType(): String {
        return "type_2 of price=$price"
    }
}