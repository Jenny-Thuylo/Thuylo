package com.global.lesson2;
import java.util.Scanner;

public class Calculator {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in); // Khởi tạo đối tượng input

        System.out.println("Input the first number: "); // in text "Input the first number: "
        int number1 = input.nextInt(); // / Khai báo biến number1 và nhập giá trị từ bàn phím

        System.out.println("Input the second number: "); // in text "Input the second number: "
        int number2 = input.nextInt(); // Khai báo biến number1 và nhập giá trị từ bàn phím

        System.out.println("Addition: " + (number1 + number2)); // Tính tổng
        System.out.println("Subtraction: " + (number1 - number2)); // Tính hiệu
        System.out.println("Multiplication: " + (number1 * number2)); // Tính tích
        System.out.println("Division: " + (number1 / number2)); // Tính thương

        input.close(); // Lệnh kết thúc nhập giá trị từ bàn phím
    }
}
