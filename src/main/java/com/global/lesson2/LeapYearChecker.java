package com.global.lesson2;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Khởi tạo đối tượng input

        System.out.println("Enter a year: ");//In text
        int year = input.nextInt(); // khai báo biến weight và nhập giá trị từ bàn phím

        // Kiểm tra năm nhuận theo các điều kiện
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year"  );//In text
        } else {
            System.out.println(year + " isn't a leap year"  );//In text
        }
       input.close(); // đóng lệnh nhập từ bàn phím
    }
}
