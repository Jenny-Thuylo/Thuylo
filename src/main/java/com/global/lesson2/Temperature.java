package com.global.lesson2;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Khởi tạo đối tượng input

        System.out.println("Enter temperature in Celsius: ");//In text
        double temperatureCelsius = input.nextDouble(); // khai báo biến temperatureCelsius và nhập giá trị từ bàn phím
        System.out.println("Temperature in Fahrenheit: " + ( (temperatureCelsius * 9/5) + 32)); // in độ F sau khi chuyển đổi
        input.close(); // đóng lệnh nhập từ bàn phím
    }
}
