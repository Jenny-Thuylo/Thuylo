package Lesson10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class DisappearingElements extends Helper{
    @Test
    @DisplayName("TC1- Click DisappearingElements")
    public void verifyDisappearingElements(){
        WebElement disappearingElements = driver.findElement(By.linkText("Disappearing Elements"));
        disappearingElements.click();
        String currentURL = driver.getCurrentUrl();
        Objects.equals("https://the-internet.herokuapp.com/disappearing_elements",currentURL);
    }
    @Test
    @DisplayName("TC2- VerifyUI")
    public void verifyUI(){
        WebElement disappearingElements = driver.findElement(By.linkText("Disappearing Elements"));
        disappearingElements.click();
        WebElement exampleClass = driver.findElement(By.className("example"));
        WebElement title = exampleClass.findElement(By.tagName("h3"));
        Objects.equals(title,"Disappearing Elements");
        WebElement paragraph = exampleClass.findElement(By.tagName("p"));
        Objects.equals(paragraph,"This example demonstrates when elements on a page change by disappearing/reappearing on each page load.");
    }
    @Test
    @DisplayName("TC3- Click Home")
    public void verifyClickHome(){
        WebElement disappearingElements = driver.findElement(By.linkText("Disappearing Elements"));
        disappearingElements.click();
        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();
        String currentURL = driver.getCurrentUrl();
        Objects.equals(currentURL,"https://the-internet.herokuapp.com/");
        WebElement heading = driver.findElement(By.className("heading"));
        Objects.equals(heading,"Welcome to the-internet");
    }
}
