package com.tm9704.kotlinoop

fun main(){

    //val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    //val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
    //print(numbers.contentToString())
    //print("initial values ${numbers.contentToString()}")
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    //print("\nfinal values ${numbers.contentToString()}")

    val days = arrayOf("Sun", "Mon", "Thus", "Wed", "Thurs", "Fri", "Sat")
    //print(days.contentToString())

    val fruits = arrayOf(Fruit("Apple",2.5), Fruit("Grape", 3.5))
    for(fruit in fruits){
        print("${fruit.name}")
    }
    for(index in fruits.indices){
        print("${fruits[index].name}is in index $index")
    }
}

data class Fruit(val name: String, val price: Double)