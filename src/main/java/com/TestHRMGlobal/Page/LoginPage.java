package com.TestHRMGlobal.Page;

import com.TestHRMGlobal.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath= "//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath= "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[text()='Required']")
    private WebElement errorMessage;

    @FindBy(css = "p.oxd-alert-content-text")
    private WebElement errorMessage1;



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
        errorMessage1.getCssValue("Invalid credentials");
        System.out.println(errorMessage1);
    }

    public void displayErrorMessageUsernameNull(){
        errorMessage.getCssValue("Required");
    }

    public void displayErrorMessagePasswordNull(){
        errorMessage.getCssValue("Required");
    }
}
