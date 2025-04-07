import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSuccessTest {
    @Test
    public void loginSuccess() throws InterruptedException {
        WebDriver driver = new ChromeDriver(); // Khởi tạo WebDriver
        driver.get("https://www.saucedemo.com/"); // Mở trang web
        Thread.sleep(4000);
        WebElement txtUsername = driver.findElement(By.id("user-name"));
        txtUsername.sendKeys("standard_user");
        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("secret_sauce");
        WebElement LoginButton = driver.findElement(By.id("login-button"));
        LoginButton.click();
    }
    }

