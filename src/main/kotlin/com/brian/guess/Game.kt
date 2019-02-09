package com.brian.guess

import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {

    var number: Int = Random.nextInt(10) + 1;
    println("number : $number");

    var guessNum: Int = 0;
    while (guessNum != number) {
        print("Please enter number : ");
        guessNum = Scanner(System.`in`).nextInt();
        if (guessNum > number) {
            println("highest");
        } else if (guessNum < number) {
            println("lowest");
        } else {
            println("V");
        }
    }

}