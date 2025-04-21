package com.global.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[]args){
        Scanner me = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(10);
        n += 1;

        int number = me.nextInt();
        System.out.println("Enter your guess: "+ number);

        if(number < n){
            System.out.println("Too low! Try again.");
        } else if (number > n ) {
            System.out.println("Too high! Try again.");
        }
        else{
            System.out.println("Correct! The number was" + number);
            System.out.println("It took you 3 attempts.");
        }
        me.close();
    }
}
