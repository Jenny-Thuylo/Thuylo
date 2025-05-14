package com.TestHRMGlobal.Page;

import com.TestHRMGlobal.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends BasePage {
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement adminTab;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;


    @FindBy(xpath = "//h6[text()='Add User']")
    WebElement addUserHeader;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]")
    WebElement userRoleDropdown;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
    WebElement statusDropdown;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameInput;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement usernameInput;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement passwordInput;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    public void goToAdminPage() {
        adminTab.click();
    }

    public void clickAddButton() {
        addButton.click();
    }

    public AddUserPage(WebDriver driver) {
        super(driver); // Khởi tạo BasePage
        PageFactory.initElements(driver, this); // Khởi tạo các element được đánh dấu @FindBy
    }

    public boolean isAddUserPageVisible() {
        return addUserHeader.isDisplayed();
    }

    public void selectUserRole(String roleText) {
        userRoleDropdown.click();
        WebElement option = driver.findElement(By.xpath("//div[@role='option']/span[text()='" + roleText + "']"));
        option.click();
    }

    public void selectStatus(String statusText) {
        statusDropdown.click();
        WebElement option = driver.findElement(By.xpath("//div[@role='option']/span[text()='" + statusText + "']"));
        option.click();
    }

    public void enterEmployeeName(String empName) {
        employeeNameInput.sendKeys(empName);

        // Choose the first suggestion after load autocomplete
        WebElement suggestion = driver.findElement(By.xpath("//div[contains(@class,'oxd-autocomplete-text-input')]//input"));
        suggestion.click();
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String pwd) {
        passwordInput.sendKeys(pwd);
    }

    public void confirmPassword(String pwd) {
        confirmPasswordInput.sendKeys(pwd);
    }

    public void clickSave() {
        saveButton.click();
    }
}
