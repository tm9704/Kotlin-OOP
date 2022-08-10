package com.tm9704.kotlinoop

fun main() {
    // Creating instances of classes
    var denis = Person2("Denis", "Panjuta", 31)
    denis.hobby = "to skateboard"
    denis.age = 32
    println("Desnis is ${denis.age}")
    denis.stateHobby()
    var john = Person2()
    john.hobby = "play video games"
    john.stateHobby()
    //var johnPeterson = Person2(lastName = "Peterson")
}

class Person2 (firstName: String = "John", lastName: String = "Doe"){
    // Member Variables - Properties
    var age: Int? = null
    var hobby: String = "watch Netflix"
    var firstName: String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with firstName = $firstName and lastName" +
                " = $lastName")
    }

    //Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
                this.age = age
            }

    // Member functions - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}