package com.brian

fun main(args: Array<String>) {
//    println("Hello Kotlin");
//    Person2().hello();
    val person2 = Person2(weight = 70f, high = 1.7f);
    println(person2.bmi());
//    person2.hello();
//    var a: Int = 1;
//    a = 2;

    val apple: Char = 'A';
    println(apple.toInt() > 80);

    var s : String? = "aaa";
    s = null;
    println(s!!.length);
}

class Person2(var name: String = "", var weight: Float, var high: Float) {

    fun bmi(): Float {
        return weight / (high * high);
    }

    fun hello() {
        println("Hello Kotlin");
    }
}