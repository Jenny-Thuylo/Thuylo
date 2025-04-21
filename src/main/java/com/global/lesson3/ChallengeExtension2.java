package com.global.lesson3;
import java.util.Random;
import java.util.Scanner;

public class ChallengeExtension2 {
    public static void main(String[]args){
        Scanner me = new Scanner(System.in);
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy (1-50)");
        System.out.println("2. Medium (1-100)");
        System.out.println("3. Hard (1-1000)");

        Random rand = new Random();
        int n = rand.nextInt(50);
        n += 1;

        int m = rand.nextInt(100);
        m += 1;

        int l = rand.nextInt(1000);
        l += 1;

        System.out.println("Enter your choice, please!");

        int number = me.nextInt();
        System.out.println("Enter your choice (1/2/3): " + number);

        switch (number){
            case 1:
                System.out.println("I have selected a number between 1 and 50");
                System.out.println("Enter your guess, please!");
                int input1 = me.nextInt();
                System.out.println("Enter your guess" + input1);
                if(input1 < n ){
                    System.out.println("Too low! Try again.");
                }
                else if (input1 > n ){
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("Correct! The number was" + input1);
                    System.out.println("It took you 3 attempts.");
                }
                break;
            case 2:
                System.out.println("I have selected a number between 1 and 100");
                System.out.println("Enter your guess, please!");
                int input2 = me.nextInt();
                System.out.println("Enter your guess" + input2);
                if(input2 < m ){
                    System.out.println("Too low! Try again.");
                }
                else if (input2 > m ){
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("Correct! The number was" + input2);
                    System.out.println("It took you 3 attempts.");
                }
            case 3:
                System.out.println("I have selected a number between 1 and 100");
                System.out.println("Enter your guess, please!");
                int input3 = me.nextInt();
                System.out.println("Enter your guess" + input3);
                if(input3 < l ){
                    System.out.println("Too low! Try again.");
                }
                else if (input3 > l ){
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("Correct! The number was" + input3);
                    System.out.println("It took you 3 attempts.");
                }
                default: System.out.println("input incorrect");
        }
    }
}
