package com.TestHRMGlobal.Base;

import com.TestHRMGlobal.Page.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestAfterLogin {
    protected WebDriver driver;
    @BeforeEach
    public void setDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        LoginPage loginPage = new LoginPage(getDriver());// Tạo đối tượng LoginPage va gọi các phương thức
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();
        Thread.sleep(5000);
    }
    @AfterEach
    public void afterEach(){
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
