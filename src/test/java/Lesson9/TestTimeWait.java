package Lesson9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestTimeWait {
    private WebDriver driver;
    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
    }
    @Test
    public void implicitWait() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        long startTime = System.currentTimeMillis();
        Thread.sleep(4000);
        //implicit wait
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("txt1"));
        long endTime = System.currentTimeMillis();
        System.out.println("Implicit wait"+ (endTime - startTime));
        driver.quit();
    }
    @Test
    public void explicitWait() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread.sleep(4000);
        driver.findElement(By.id("btn2")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedCondition.visibilityOfElementLocated(By.id("txt2")));
        long endTime = System.currentTimeMillis();
        System.out.println("explicit wait"+ (endTime - startTime));
        driver.quit();
    }
    @AfterEach
    public void afterEach(){
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }

}

