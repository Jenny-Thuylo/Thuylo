package com.global.lesson2;

import java.util.Scanner;

public class CounterProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Khởi tạo đối tượng input

        System.out.println("Enter your weight in kilograms: ");//In text
        int number = input.nextInt(); // khai báo biến weight và nhập giá trị từ bàn phím

        int x = ++number;
        int y = --number;

        System.out.println("After incrementing: " + x );//In text
        System.out.println("After decrementing: " + y );//In text

        input.close(); // đóng lệnh nhập từ bàn phím
    }
}
