package Lesson9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {
    @Test
    public void verifyTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        String pageTitle = driver.getTitle();
        assert pageTitle != null;
        pageTitle.contains("Swag Labs");
        driver.quit();
    }
}
