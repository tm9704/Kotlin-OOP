package com.tm9704.kotlinoop

fun main(){
    addNumber(5,10)

    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a+b}
    println(sum(10, 5))

    //even shorter
    val sum2 = {a: Int, b: Int -> println(a+b)}
    sum2(10,5)
}

fun addNumber(a: Int, b: Int){
    val add = a + b
    println(add)
}
