package Lesson10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
    public WebDriver driver;

    @BeforeEach
    public void setDriver(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }
    @Test
    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}
