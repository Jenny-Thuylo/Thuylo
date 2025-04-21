package Lesson9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

//    Verify that products are sorted by default (name A-Z)
public class SortTest {
    @Test
    public void verifySorting() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='Name (Z to A)']"));
        option.click();
        assertTrue(driver.findElement(By.cssSelector(".inventory_item:nth-child(1)")).isDisplayed());
//        driver.quit();
    }
}