package com.TestHRMGlobal.Page;

import com.TestHRMGlobal.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends BasePage {
    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashboardTitle;

   @FindBy(xpath = "//p[text()='Time at Work']")
   private WebElement timeAtWork;

    @FindBy(xpath = "//p[text()='My Actions']")
    private WebElement myActions;

    @FindBy(xpath = "//p[text()='Quick Launch']")
    private WebElement quickLaunch;

    public Dashboard(WebDriver driver) {
        super(driver); // Khởi tạo BasePage
        PageFactory.initElements(driver, this); // Khởi tạo các element được đánh dấu @FindBy
    }

    public boolean isDashboardDisplayed() {
        return dashboardTitle.isDisplayed();
    }

    public void getTextDashboard() {
        System.out.println("title is"+ dashboardTitle.getText());
    }

    public boolean isTimeAtWorkDisplayed() {
        return timeAtWork.isDisplayed();
    }

    public boolean isMyActionDisplayed() {
        return myActions.isDisplayed();
    }

    public boolean isQuickLaunchDisplayed() {
        return quickLaunch.isDisplayed();
    }



}
