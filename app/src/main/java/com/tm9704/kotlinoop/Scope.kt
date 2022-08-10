package com.tm9704.kotlinoop

var c = 3

fun main(){
    myFunction(5)
    // b = 3 -> 여기서는 쓸 수 없음
    c = 4
}

// this a is a parameter
fun myFunction(a: Int){
    // a is a variable not the same as parameter a
    var a = 4
    println("a is $a")

    var b = a
    println("b is $b")

    c = a
    println("c is $c")
}