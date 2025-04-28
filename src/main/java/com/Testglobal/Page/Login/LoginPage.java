package com.Testglobal.Page.Login;

import com.Testglobal.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "h3[data-test='error']")
    private WebElement errorMessage;

    // Constructor sử dụng PageFactory.initElements
    public LoginPage(WebDriver driver) {
        super(driver); // Khởi tạo BasePage
        PageFactory.initElements(driver, this); // Khởi tạo các element được đánh dấu @FindBy
    }

    public void navigateToLoginPage(String url){
        driver.navigate().to(url);
    }

    public void enterUsername(String value){
        usernameField.sendKeys(value);
    }

    public void enterPassword(String value){
        passwordField.sendKeys(value);
    }

    public void clickLogin(){
        loginButton.click();
    }
    public void displayErrorMessage(){
        errorMessage.getCssValue("Epic sadface: Username and password do not match any user in this service");
    }

    public void displayErrorMessageUsernameNull(){
        errorMessage.getCssValue("Epic sadface: Username is required");
    }

    public void displayErrorMessagePasswordNull(){
        errorMessage.getCssValue("Epic sadface: Password is required");
    }
}
