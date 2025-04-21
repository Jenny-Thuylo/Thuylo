package com.global.lesson2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Khởi tạo đối tượng input

        System.out.println("Enter your weight in kilograms: ");//In text
        double weight = input.nextDouble(); // khai báo biến weight và nhập giá trị từ bàn phím

        System.out.println("Enter your height in meters: ");//In text
        double height = input.nextDouble(); // khai báo biến height và nhập giá trị từ bàn phím

        System.out.println("Your BMI is: " + (weight/(height * height))); // in độ F sau khi chuyển đổi
        input.close(); // đóng lệnh nhập từ bàn phím
    }
}
