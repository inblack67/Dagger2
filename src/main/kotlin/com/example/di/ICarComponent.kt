package com.example.di
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

//@Component(modules = [WheelsModule::class, Seat2Module::class])
@Component(modules = [WheelsModule::class, Seat1Module::class])
interface ICarComponent {
    fun getCarInstance() : Car
    fun inject(myMain: MyMain) // field injection => name inject is random but the arguments matter

//    overriding the dagger2 builder
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun price(@Named("price") price : Double) : Builder

        @BindsInstance
        fun discount(@Named("discount") discount: Double) : Builder

        fun build() : ICarComponent
    }

}
