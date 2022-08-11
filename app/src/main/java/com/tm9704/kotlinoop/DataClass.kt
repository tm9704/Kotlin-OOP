package com.tm9704.kotlinoop

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1, "Denis")

    user1.name = "Michael"

    val user2 = User(1, "Michael")
    println(user1.equals(user2))

    println("User Details: $user1")

    val updateUser = user1.copy(name = "Denis Panjuta")
    println(user1)
    println(updateUser)

    println(updateUser.component1()) //print 1
    println(updateUser.component2()) //prints Denis Panjuta

    //Destructuring
    val(id,name) = updateUser
    println("id = $id, name = $name")
}