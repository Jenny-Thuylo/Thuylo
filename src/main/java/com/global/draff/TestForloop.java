package com.global.draff;
import java.util.Scanner;

public class TestForloop {
    public static void main(String[]args){
//        bt: user input int a,b. if boi chung ?> 100 then in ra boi chung nn
        // else in ra bc nn
        System.out.println("input so tu nhien:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a*b;
        while(c >=100){
            if(c % a == 0 & c % b ==0){
                System.out.println(c);
                c++;
                break;
            }
        }
        if(c % a == 0 & c % b ==0) {
            System.out.println(c);
            c++;
        }
    }
}
