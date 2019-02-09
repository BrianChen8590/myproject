package com.brian.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(10) + 1;
//        System.out.println("number is : " + number);

        Scanner scanner = new Scanner(System.in);
        int guessNum = 0;
        while (guessNum != number) {
            System.out.print("please enter number : ");
            guessNum = scanner.nextInt();

            if (guessNum > number) {
                System.out.println("highest");
            } else if (guessNum < number) {
                System.out.println("lowest");
            } else {
                System.out.println("V");
            }
        }
    }
}
