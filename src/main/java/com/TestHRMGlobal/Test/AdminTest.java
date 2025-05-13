package com.TestHRMGlobal.Test;

import com.TestHRMGlobal.Base.BaseTestAfterLogin;
import com.TestHRMGlobal.Page.AdminPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AdminTest extends BaseTestAfterLogin {
    @Test
    @DisplayName("TC1- AdminPage- verifyDashboard")
    public void verifyAdminPage() throws InterruptedException {
        AdminPage ad = new AdminPage(getDriver());
        ad.goToAdminPage();
        Thread.sleep(5000);
        ad.getAdminPageTitle();
        System.out.println("Title is" + ad.getAdminPageTitle());
    }

    @Test
    @DisplayName("TC2- AdminPage- AdminPageDisplay")
    public void verifyAdminPageDisplay() throws InterruptedException {
        AdminPage ad = new AdminPage(getDriver());
        ad.goToAdminPage();
        Thread.sleep(10000);
        if (ad.isAdminPageDisplayed()){
            System.out.println("Admin page is displayed");
        } else {
            System.out.println("Admin page is not display");
        }
    }

    @Test
    @DisplayName("TC3- AdminPage- Add User")
    public void verifyAddUser() throws InterruptedException {
        AdminPage ad = new AdminPage(getDriver());
        ad.goToAdminPage();
        Thread.sleep(10000);
        if (ad.isAdminPageDisplayed()) {
            System.out.println("access Admin page: " + ad.getAdminPageTitle());
            ad.clickAddButton();
            System.out.println("You was click Add button.");
            Thread.sleep(10000);
            System.out.println("Form Add User is display.");
        } else {
            System.out.println("Trang Admin is not display");
        }
    }
}
