package com.tm9704.kotlinoop

// The class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class, and the class whose features are
// inherited is called the Super class or Parent class
// or Base class.

// Super Class, Parent Class, Base Class of Car
open class Car(val name: String, val brand: String){
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

// SubClass Child class or Derived class of Car
class ElectricCar(name: String, brand: String, batteryLife: Double) : Car(name, brand){

    var chargerType = "Type1"
    override var range = batteryLife * 5

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    fun drive(){
        println("Drove for $range KM on electricity")
    }
}

//Any class inherits from the Any Class

fun main(){
    var audiA3 = Car("A3", "Audi")
    var teslaS = ElectricCar("S-Model", "Tesla", 85.0)

    teslaS.chargerType = "Type2"
    teslaS.extendRange(200.0)
    teslaS.drive()

    //Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}
