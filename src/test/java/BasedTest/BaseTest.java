package BasedTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setDriver(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
