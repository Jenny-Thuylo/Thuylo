import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.time.Duration;

public class TestTimeWait {
    @BeforeTest
    public void setUp(){
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
    }
    @Test
    public void implicitWait() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        long startTime = System.currentTimeMillis();
        Thread.sleep(4000);
        //implicit wait
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("txt1"));
        long endTime = System.currentTimeMillis();
        System.out.println("Implicit wait"+ (endTime - startTime));
    }
    @Test
    public void explicitWait() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        long startTime = System.currentTimeMillis();
        Thread.sleep(4000);
        //implicit wait
        driver.findElement(By.id("btn2")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedCondition.visibilityOfElementLocated(By.id("txt2")));
        long endTime = System.currentTimeMillis();
        System.out.println("explicit wait"+ (endTime - startTime));
    }
}

