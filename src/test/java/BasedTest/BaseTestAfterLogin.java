package BasedTest;

import com.Testglobal.Page.Login.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestAfterLogin {
    protected WebDriver driver;

    @BeforeEach
    public void setDriver(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(getDriver());// Tạo đối tượng LoginPage va gọi các phương thức
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
