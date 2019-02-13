package com.brian.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {

        Random random = new Random();
        int guessNum = random.nextInt(10) + 1;
        System.out.println("Hello world : " + guessNum);

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Please enter number " + i + "/5 : ");
            int number = scanner.nextInt();
            if (guessNum > number) {
                System.out.println("high");
            } else if (guessNum < number) {
                System.out.println("low");
            } else {
                System.out.println("Bingo");
                break;
            }
        }
    }
}
