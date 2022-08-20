package com.tm9704.kotlinoop

class OuterClass{
    //outer class code
    private var name: String = "Mr X"
    class NestedCLass{
        //nested class code
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo(){
            // print("name is ${name}") // cannot access the outer class member

            println("Id is $id")
        }
    }
}

class OuterClass2{
    //outer class code
    private var name: String = "Mr X"
    inner class InnerClass{
        //inner class code
        var description: String = "code inside inner class"
        private var id: Int = 101
        fun foo(){
            println("name is ${name}") // access the private outer class member
            println("Id is $id")
        }
    }
}

fun main(args: Array<String>){
    //nested class must be initialized
    println(OuterClass.NestedCLass().description) //accessing property

    var obj = OuterClass.NestedCLass() // object creation
    obj.foo() // access member function

    println(OuterClass2().InnerClass().description) // accessing property

    var obj2 = OuterClass2().InnerClass() // object creation

    obj2.foo() // access member function
}