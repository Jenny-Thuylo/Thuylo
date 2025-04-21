package Lesson10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class AlertTest extends Helper{
    @Test
    @DisplayName("TC1- Click JavaScrip Alert")
    public void verifyJavaScripAlert(){
        WebElement jsAlert = driver.findElement(By.linkText("JavaScript Alerts"));
        jsAlert.click();
        String currentURL = driver.getCurrentUrl();
        Objects.equals("https://the-internet.herokuapp.com/javascript_alerts",currentURL);
    }
    @Test
    @DisplayName("TC2- Click for JS Alert")
    public void verifyClickForJSAlert(){
        WebElement jsAlert = driver.findElement(By.linkText("JavaScript Alerts"));
        jsAlert.click();
        WebElement button1 = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        button1.click();
//Open alert
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Alert 1 text: " + alert1.getText());
        alert1.accept();
    }
}
