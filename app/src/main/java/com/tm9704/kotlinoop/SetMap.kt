package com.tm9704.kotlinoop

fun main(){

    val fruits = setOf("Orange", "Apple", "Mango", "Grape", " Apple")
    print(fruits)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[2]) // not index, key
    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruits("Grape", 2.5),
        "OK" to Fruits("Apple", 1.6))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    println(newDaysOfWeek.toSortedMap())

}

data class Fruits(val name: String, val price: Double)