package com.global.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestTimeWait1 {
    @BeforeTest
    public void setUp(){
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
    }
    @Test
    public void implicitWait(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        long startTime = System.currentTimeMillis();
        //implicit wait
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("txt1"));
        long endTime = System.currentTimeMillis();
        System.out.println("Implicit wait"+ (endTime - startTime));
    }

}
