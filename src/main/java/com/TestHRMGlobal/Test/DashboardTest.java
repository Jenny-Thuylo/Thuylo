package com.TestHRMGlobal.Test;

import com.TestHRMGlobal.Base.BaseTestAfterLogin;
import com.TestHRMGlobal.Page.Dashboard;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DashboardTest extends BaseTestAfterLogin {

    @Test
    @DisplayName("TC1- Dashboard- displayDashboard")
    public void displayDashboard() throws InterruptedException{
        Dashboard db = new Dashboard(getDriver());
        if (db.isDashboardDisplayed()){
            System.out.println("Dashboard is displayed");
        } else {
            System.out.println("Dashboard is not display");
        }
    }
    @Test
    @DisplayName("TC2- Dashboard- verifyDashboard")
    public void verifyDashboard() throws InterruptedException{
        Dashboard db = new Dashboard(getDriver());
        db.getTextDashboard();
    }
    @Test
    @DisplayName("TC3- Dashboard- verifyMyActions")
    public void verifyMyActions() throws InterruptedException{
        Dashboard db = new Dashboard(getDriver());
        if (db.isMyActionDisplayed()){
            System.out.println("My Actions is displayed");
        } else {
            System.out.println("My Actions is not display");
        }
    }

    @Test
    @DisplayName("TC4- Dashboard- verifyTimeAtWork")
    public void verifyTimeAtWork() throws InterruptedException{
        Dashboard db = new Dashboard(getDriver());
        if (db.isTimeAtWorkDisplayed()){
            System.out.println("Time At Work is displayed");
        } else {
            System.out.println("Time At Work is not display");
        }
    }

    @Test
    @DisplayName("TC5- Dashboard- verifyQuickLaunch")
    public void verifyQuickLaunch(){
        Dashboard db = new Dashboard(getDriver());
        if (db.isQuickLaunchDisplayed()){
            System.out.println("Quick Launch is displayed");
        } else {
            System.out.println("Quick Launch is not display");
        }
    }
}
