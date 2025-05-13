package com.TestHRMGlobal.Test;

import com.TestHRMGlobal.Base.BaseTest;
import com.TestHRMGlobal.Page.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    @Test
    @DisplayName("TC1 - Login successfully")
    public void login(){
        LoginPage loginPage = new LoginPage(getDriver());// Tạo đối tượng LoginPage va gọi các phương thức
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();
    }
    @Test
    @DisplayName("TC2- Login fail: user name null")
    public void nameNull() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());// Tạo đối tượng LoginPage va gọi các phương thức
        loginPage.enterUsername("");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();
        Thread.sleep(5000);
        loginPage.displayErrorMessageUsernameNull();
    }
    @Test
    @DisplayName("TC3- Login fail: password null")
    public void passwordNull() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("");
        loginPage.clickLogin();
        Thread.sleep(5000);
        loginPage.displayErrorMessagePasswordNull();
    }
    @Test
    @DisplayName("TC4- Login fail: user name is not exists")
    public void usernameNotExists() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUsername("NotExists");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();
        Thread.sleep(5000);
        loginPage.displayErrorMessage();
    }
    @Test
    @DisplayName("TC5- Login fail: Password is incorrect")
    public void passwordIncorrect() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("PasswordIncorrect");
        loginPage.clickLogin();
        Thread.sleep(5000);
        loginPage.displayErrorMessage();
    }
}

