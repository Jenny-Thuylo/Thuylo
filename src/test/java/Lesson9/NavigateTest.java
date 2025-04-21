package Lesson9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {
    @Test
    public void navicateTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // Khởi tạo WebDriver
        // 1. Navigate to saucedemo.com
        // way 1
        // sử dụng hàm get
        driver.get("https://www.saucedemo.com/"); // Mở trang web
        Thread.sleep(4000);

        // way 2
        // Sử dụng hàm .to(string url) navigate để chuyển đến 1 trang bất kỳ
        // hoặc sử dụng hàm .back() để điều hướng quay lại trang trước đó
//        driver.get("https://www.google.com");
//        Thread.sleep(2000);
//        Quay lại trang trước đó (Google)
//        driver.navigate().to("https://www.saucedemo.com/");
//        Thread.sleep(2000);
        driver.quit();
    }
}
