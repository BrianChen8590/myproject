package com.brian.student

fun main(args: Array<String>) {
    val person = Person(name = "Tom", english = 99, math = 89)
    println(person.print());
    println("average score : ${person.getAverage()}");
    println("high score ${person.highest()}");
    println("grading ${person.grading()}");
}

class Person(var id: String = "0", var name: String, var english: Int, var math: Int) {
    fun print(): String {
        return "Name : $name, English : $english, Math : $math";
    }

    fun getAverage() = (english + math) / 2;

    fun highest(): Int {
        var highest: Int = if (english > math) {
            english;
        } else {
            math;
        }
        return highest;
    }

    fun grading(): Char {
        var grading = when (getAverage()) {
            100 -> 'A';
            99, 98, 97, 96, 95, 94, 93, 92, 91, 90 -> 'B';
            in 89..80 -> 'C';
            else -> 'F';
        };
        return grading;
    }
}