package com.brian.guess

import java.util.*

fun main(args: Array<String>) {

    var guessNum: Int = Random().nextInt(10) + 1;
    println("guessNum : ${guessNum.toString()}");

    var scanner = Scanner(System.`in`);
    for (i in 1..5) {
        print("please enter number ${i}/5 :")
        var number = scanner.nextInt();
        if (guessNum > number) {
            println("high");
        } else if (guessNum < number) {
            println("low");
        } else {
            println("bingo");
            break;
        }
    }


}