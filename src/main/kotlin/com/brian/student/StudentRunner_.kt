package com.brian.student

fun main(args: Array<String>) {
    val person = Person(name = "Tom", english = 59, math = 89)
    print(person.print());
}

class Person(var id: String = "0", var name: String, var english: Int, var math: Int) {
    fun print(): String {
        return "Name : $name, English : $english, Math : $math";
    }
}