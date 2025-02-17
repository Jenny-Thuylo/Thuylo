package com.global.lesson3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number1: ");
        int number1 = input.nextInt();

        System.out.println("input number2: ");
        int number2 = input.nextInt();

        System.out.println("sum of number: " + (number1 + number2));

        input.close();

    }
}
