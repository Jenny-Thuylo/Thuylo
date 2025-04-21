package Lesson10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DynamicControls {
    public WebDriver driver;

    @BeforeEach
    public void setDriver(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }
    @Test
    @DisplayName("TC1- Click Dynamic controls link")
    public void dynamicControlClick() {
        WebElement dynamicControl = driver.findElement(By.linkText("Dynamic Controls"));
        dynamicControl.click();
        String currentURL = driver.getCurrentUrl();
        assertEquals("https://the-internet.herokuapp.com/dynamic_controls", currentURL);

    }
    @Test
    @DisplayName("TC2- verify Checkbox if checkbox is not checked, checkbox will be checked." +
            "Then remove checkbox and add again that checkbox")
    public void verifyCheckbox () throws InterruptedException {
        WebElement dynamicControl = driver.findElement(By.linkText("Dynamic Controls"));
        dynamicControl.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement checkbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("checkbox"))
        );
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected");
        }
        else System.out.println("checkbox isn't selected");

        WebElement removeCheckbox = driver.findElement(By.xpath("//form[@id='checkbox-example']/button"));
        removeCheckbox.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        System.out.println("Checkbox is deleted");
        Thread.sleep(3000);

        WebElement addCheckbox = driver.findElement(By.xpath("//form[@id='checkbox-example']/button"));
        addCheckbox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
        System.out.println("Checkbox is displayed");
    }

    @Test
    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}
