package com.global.lesson3;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[]args){
        Scanner me = new Scanner(System.in);
        System.out.println("Input: ");
        float per = me.nextFloat();
        String result = "";

        if(per >= 90 & per <= 100){
            result = "A";
        }
        if(per >= 80 & per <= 89){
            result = "B";
        }
        if(per >= 70 & per <= 79){
            result = "C";
        }
        if(per >= 60 & per <= 69){
            result = "D";
        }
        if(per >= 0 & per <= 59){
            result = "E";
        }

        switch (result){
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
                break;
        }
        System.out.println("Your grade is:" + result);
    }
}
