package Lesson10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class AddRemoveElements extends Helper{
    @Test
    @DisplayName("TC1- Click Add/Remove Element")
    public void verifyAddRemoveElements(){
        WebElement addRemoveElements = driver.findElement(By.linkText("Add/Remove Elements"));
        addRemoveElements.click();
        String currentURL = driver.getCurrentUrl();
        Objects.equals("https://the-internet.herokuapp.com/add_remove_elements/",currentURL);
    }
    @Test
    @DisplayName("TC2- Add/ remove element")
    public void verifyUI(){
        WebElement addRemoveElements = driver.findElement(By.linkText("Add/Remove Elements"));
        addRemoveElements.click();

        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addButton.click();

        // Delete appear
        WebElement deleteButton = driver.findElement(By.className("added-manually"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Delete appear");
        }

        deleteButton.click();
    }
}
