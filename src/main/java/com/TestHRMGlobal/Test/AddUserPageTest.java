package com.TestHRMGlobal.Test;

import com.TestHRMGlobal.Base.BaseTestAfterLogin;
import com.TestHRMGlobal.Page.AddUserPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddUserPageTest extends BaseTestAfterLogin {
    @Test
    @DisplayName("TC1- AdminPage- Add User")
    public void verifyAddUser1() throws InterruptedException {
        AddUserPage addUserPage = new AddUserPage(getDriver());
        addUserPage.goToAdminPage();
        Thread.sleep(5000);
        addUserPage.clickAddButton();
        Thread.sleep(5000);
        if (addUserPage.isAddUserPageVisible()) {
            System.out.println("Trang Add User hiển thị.");
            addUserPage.selectUserRole("Admin");
            addUserPage.enterEmployeeName("Tester");
            addUserPage.enterUsername("newuser123");
            addUserPage.selectStatus("Enabled");
            addUserPage.enterPassword("Password@123");
            addUserPage.confirmPassword("Password@123");
            Thread.sleep(5000);
            addUserPage.clickSave();

            System.out.println("Form Add User đã được gửi.");
        } else {
            System.out.println("Không vào được trang Add User.");
        }
    }
}
