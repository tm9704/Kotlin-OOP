package com.tm9704.kotlinoop

// An abstract class cannot be instantiated
// (you cannot create objects of an abstract class.)
// However, you can inherit subclasses from an abstract class.
// The members (properties and methods) of an abstract class are non-abstract
// unless you explicitly use the abstract keyword to make them abstract.

abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double) { //Concrete(Non Abstract) Properties

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract  fun run()
    abstract fun breath()

    //Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double) : Mammal(name, origin, weight){

    override fun run() {
        //Code to run
        println("Runs on two legs")
    }

    override fun breath(){
        //Code to run
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double,
            override var maxSpeed: Double) : Mammal(name, origin, weight){

    override fun run() {
        //Code to run
        println("Runs on two legs")
    }

    override fun breath(){
        //Code to run
        println("Breath through the trunk")
    }
}

fun main() {
    val human = Human("Denis", "Russia", 70.0, 28.0)
    val elephant = Elephant("Rosy", "India", 5400.0, 25.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}