package Lesson9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordIncorrect {
    @Test
    public void verifyPasswordIncorrect() throws InterruptedException {
        WebDriver driver = new ChromeDriver(); // Khởi tạo WebDriver
        driver.get("https://www.saucedemo.com/");
        WebElement username =  driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement button = driver.findElement(By.id("login-button"));

        username.sendKeys("Test");
        password.sendKeys("wrongPassword");
        button.click();
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        errorMessage.getCssValue("Epic sadface: Username and password do not match any user in this service");
        driver.quit();
    }
}
