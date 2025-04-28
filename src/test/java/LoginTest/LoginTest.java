package LoginTest;

import BasedTest.BaseTest;
import com.Testglobal.Page.Login.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {


    @Test
    @DisplayName("TC1 - Login successfully")
    public void login(){
        LoginPage loginPage = new LoginPage(getDriver());// Tạo đối tượng LoginPage va gọi các phương thức
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }
    @Test
    @DisplayName("TC2- Login fail: user name null")
    public void nameNull(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUsername("");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        loginPage.displayErrorMessageUsernameNull();
    }
    @Test
    @DisplayName("TC3- Login fail: password null")
    public void passwordNull(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("");
        loginPage.clickLogin();
        loginPage.displayErrorMessagePasswordNull();
    }
    @Test
    @DisplayName("TC4- Login fail: user name is not exists")
    public void usernameNotExists(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUsername("NotExists");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        loginPage.displayErrorMessage();
    }
    @Test
    @DisplayName("TC5- Login fail: Password is incorrect")
    public void passwordIncorrect(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("PasswordIncorrect");
        loginPage.clickLogin();
        loginPage.displayErrorMessage();
    }
}
