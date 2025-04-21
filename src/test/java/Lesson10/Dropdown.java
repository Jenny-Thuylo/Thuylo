package Lesson10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

public class Dropdown extends Helper{
    @Test
    @DisplayName("TC1- Click dropdown")
    public void verifyDropdown(){
        WebElement dropDown = driver.findElement(By.linkText("Dropdown"));
        dropDown.click();
        String currentURL = driver.getCurrentUrl();
        Objects.equals("https://the-internet.herokuapp.com/dropdown",currentURL);
    }
    @Test
    @DisplayName("TC2- Choose dropdown value")
    public void verifyChooseDropdown(){
        WebElement dropDown = driver.findElement(By.linkText("Dropdown"));
        dropDown.click();
        WebElement exampleClass = driver.findElement(By.className("example"));
        WebElement title = exampleClass.findElement(By.tagName("h3"));
        Objects.equals(title,"Dropdown List");
        WebElement dropdownElement = exampleClass.findElement(By.id("dropdown"));
        Select dropdown = new Select(dropdownElement); // init Select object
        dropdown.selectByVisibleText("Option 1"); //Choose option 1
        System.out.println("Choose"+dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("Option 2"); //Choose option 2
        System.out.println("Choose"+dropdown.getFirstSelectedOption().getText());
    }
}
