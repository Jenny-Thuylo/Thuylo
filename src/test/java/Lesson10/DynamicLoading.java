package Lesson10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicLoading {
    public WebDriver driver;
    @BeforeEach
    public void setDriver(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }
    @Test
    @DisplayName("TC1- Click Dynamic Loading link")
    public void dynamicControlClick() {
        WebElement dynamicControl = driver.findElement(By.linkText("Dynamic Loading"));
        dynamicControl.click();
        String currentURL = driver.getCurrentUrl();
        assertEquals("https://the-internet.herokuapp.com/dynamic_loading", currentURL);
        Objects.equals(driver.getTitle(), "Dynamically Loaded Page Elements");
    }

    //       assertTrue(firstParagraph.getText().equals("It's common to see an action get triggered that returns a result dynamically. It does not rely on the page to reload or finish loading. The page automatically gets updated (e.g. hiding elements, showing elements, updating copy, etc) through the use of JavaScript."));


    @Test
    @DisplayName("TC2- Verify click LinkText1")
    public void linkText1(){
        WebElement dynamicControl = driver.findElement(By.linkText("Dynamic Loading"));
        dynamicControl.click();

        WebElement linkText = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        linkText.click();

        WebElement exampleDiv = driver.findElement(By.className("example"));
        WebElement title = exampleDiv.findElement(By.tagName("h3"));
        System.out.println(title.getText());
        Objects.equals(title, "Dynamically Loaded Page Elements");
        WebElement description = exampleDiv.findElement(By.tagName("h4"));
        Objects.equals( description,"Example 1: Element on page that is hidden");
        WebElement startButton =  driver.findElement(By.tagName("button"));
        startButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement helloText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        System.out.println("Result: " + helloText.getText());
        String currentURL1 = driver.getCurrentUrl();
        assertEquals("https://the-internet.herokuapp.com/dynamic_loading/1", currentURL1);


    }
    @Test
    @DisplayName("TC3- Verify click LinkText2")
    public void linkText2() {
        WebElement dynamicControl = driver.findElement(By.linkText("Dynamic Loading"));
        dynamicControl.click();
        WebElement linkText1 = driver.findElement(By.linkText("Example 2: Element rendered after the fact"));
        linkText1.click();
        WebElement exampleDiv = driver.findElement(By.className("example"));
        WebElement title = exampleDiv.findElement(By.tagName("h3"));
        Objects.equals(title, "Dynamically Loaded Page Elements");
        WebElement description = exampleDiv.findElement(By.tagName("h4"));
        Objects.equals( description,"Example 2: Element rendered after the fact");
        WebElement startButton = driver.findElement(By.tagName("button"));
        startButton.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement helloText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        System.out.println("Result: " + helloText.getText());
        Objects.equals(helloText,"Hello World!");
    }
    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}
