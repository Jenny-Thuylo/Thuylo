package com.global.lesson3;
import java.util.Scanner;

public class Output {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Result toan a
        System.out.println("Input number1: ");
        int number1 = input.nextInt();

        System.out.println("input number2: ");
        int number2 = input.nextInt();

        System.out.println("input number3: ");
        int number3 = input.nextInt();

        System.out.println("result a is " + (number1 + number2 * number3));

        // Result toan b
        System.out.println("Input number4: ");
        int number4 = input.nextInt();

        System.out.println("input number5: ");
        int number5 = input.nextInt();

        System.out.println("input number6: ");
        int number6 = input.nextInt();

        System.out.println("result a is " + ((number4 + number5) % number6));

        // Result toan c
        System.out.println("Input number7: ");
        int number7 = input.nextInt();

        System.out.println("input number8: ");
        int number8 = input.nextInt();

        System.out.println("input number9: ");
        int number9 = input.nextInt();

        System.out.println("input number10: ");
        int number10 = input.nextInt();

        System.out.println("result a is " + (number7 + number8 * number9/number10));

        // Result d
        System.out.println("Input number11: ");
        int number11 = input.nextInt();

        System.out.println("input number12: ");
        int number12 = input.nextInt();

        System.out.println("input number13: ");
        int number13 = input.nextInt();

        System.out.println("Input number14: ");
        int number14 = input.nextInt();

        System.out.println("input number15: ");
        int number15 = input.nextInt();

        System.out.println("input number16: ");
        int number16 = input.nextInt();
        System.out.println("result a is " + (number11 + number12 / number13 * number14 - number15 % number16));

        input.close();
    }
}
