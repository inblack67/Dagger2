package com.example.di

import dagger.Module
import dagger.Provides

@Module
open class WheelsModule {
    @Provides
    fun provideRims() : Rim {
        return Rim()
    }

    @Provides
    fun provideTires() : Tires {
        return Tires()
    }

    @Provides
    fun provideWheels(rim: Rim, tires: Tires): Wheels {
        rim.configureRim()
        tires.inflate()
        return Wheels(rim, tires) // dagger already has rim & tires objects at this point
    }
}