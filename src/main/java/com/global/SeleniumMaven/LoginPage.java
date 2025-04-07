package com.global.SeleniumMaven;

//    Exercise: Write at least 2 test cases for each of the below scenarios
//1. Navigate to saucedemo.com.
//2. Create test cases for the login page.
//3. Develop test cases to list all products on the inventory page.
//4. Formulate test cases to verify the checkout process.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // Khởi tạo WebDriver
        // 1. Navigate to saucedemo.com
        // way 1
        // sử dụng hàm get
        driver.get("https://www.saucedemo.com/"); // Mở trang web
        Thread.sleep(4000);

        // way 2
        // Sử dụng hàm .to(string url) navigate để chuyển đến 1 trang bất kỳ
        // hoặc sử dụng hàm .back() để điều hướng quay lại trang trước đó
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        // Quay lại trang trước đó (Google)
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(2000);

        WebElement txtUsername = driver.findElement(By.id("user-name"));
        txtUsername.sendKeys("standard_user");
        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("secret_sauce");
        WebElement LoginButton = driver.findElement(By.id("login-button"));
        LoginButton.click();
    }

}
