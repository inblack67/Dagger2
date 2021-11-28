package com.example.di

import javax.inject.Inject
import javax.inject.Named

class Seat1 @Inject constructor(
    @Named("price") val price: Double,
    @Named("discount") val discount: Double
) : ISeat {
    override fun getSeatType(): String {
        return "type_1 of price=$price with discount of $discount"
    }
}