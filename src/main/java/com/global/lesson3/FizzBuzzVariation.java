package com.global.lesson3;

public class FizzBuzzVariation {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String result = "";
            if (i % 3 == 0) {
                result = "Fizz";
            }
            if (i % 5 == 0){
              result = "Buzz";
            }
            if (i % 3 == 0 & i % 5 == 0) {
                result = "FizzBuzz";
            }

            switch (result){
                case "Fizz":
                case "Buzz":
                case "FizzBuzz":
                    System.out.println(result);
                    break;
                default:
                    System.out.println(i);
            }
        }

    }
}

