package com.tm9704.kotlinoop

fun main(args: Array<String>){
    // Unsafe Cast Operator as Example
    val obj:Any? = null
    val str:String = obj as String
    println(str) // Exception in thread

    // Safe Cast Operator as? Example
    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}