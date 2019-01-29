package com.brian

fun main(args: Array<String>) {
//    println("Hello Kotlin");
//    Person2().hello();
    val person2 = Person2();
    person2.hello();
    var a: Int = 1;
    a = 2;
}

class Person2 {
    fun hello() {
        println("Hello Kotlin");
    }
}