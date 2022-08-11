package com.tm9704.kotlinoop

// The class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class, and the class whose features are
// inherited is called the Super class or Parent class
// or Base class.

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// Super Class, Parent Class, Base Class of Car
open class Car(override val maxSpeed: Double,val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    override fun drive(): String = "driving the interface drive"

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

// SubClass Child class or Derived class of Car
class ElectricCar(maxSpeed: Double,name: String, brand: String, batteryLife: Double)
    : Car(maxSpeed,name, brand){

    var chargerType = "Type1"
    override var range = batteryLife * 5

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove for $range KM on electricity"
    }

    override fun brake(){
        super.brake()
        println("brake inside of electric car")
    }
}

//Any class inherits from the Any Class

fun main(){
    var audiA3 = Car(200.0,"A3", "Audi")
    var teslaS = ElectricCar(240.0,"S-Model", "Tesla", 85.0)

    teslaS.chargerType = "Type2"
    teslaS.extendRange(200.0)

    teslaS.drive()
    teslaS.brake()
    audiA3.brake()


    //Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}
