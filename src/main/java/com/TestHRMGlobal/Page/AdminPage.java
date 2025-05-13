package com.TestHRMGlobal.Page;

import com.TestHRMGlobal.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BasePage {
    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminTab;

    @FindBy(xpath = "//h6[text()='User Management']")
    WebElement adminHeader;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;


    public AdminPage(WebDriver driver) {
        super(driver); // Khởi tạo BasePage
        PageFactory.initElements(driver, this); // Khởi tạo các element được đánh dấu @FindBy
    }

    public void goToAdminPage() {
        adminTab.click();
    }

    public boolean isAdminPageDisplayed() {
        return adminHeader.isDisplayed();
    }

    public String getAdminPageTitle() {
        return adminHeader.getText();
    }

    public void clickAddButton() {
        addButton.click();
    }

}
