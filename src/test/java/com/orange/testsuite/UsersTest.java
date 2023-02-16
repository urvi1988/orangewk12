package com.orange.testsuite;

import com.orange.pages.*;
import com.orange.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {
    LoginPage loginpage= new LoginPage();
    HomePage homePage= new HomePage();
    AdduserPage adduserPage=new AdduserPage();
    AdminPage adminPage=new AdminPage();
    DashboardPage dashboardPage=new DashboardPage();
    ViewSystemUsersPage viewSystemUsersPage= new ViewSystemUsersPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginpage.UsernameField("Admin");
        loginpage.PasswordField("admin123");
        loginpage.clickLoginbutton();
        homePage.clickonAdminTab();
        String actualMsg = viewSystemUsersPage.SystemUsersText(); // Verify "System Users" Text
        String expectedMsg = "System Users";
        Assert.assertEquals(actualMsg, expectedMsg, "System Users text verified");
        viewSystemUsersPage.clickonAddButton();
        String actualMsg1 = adduserPage.AddUsersText(); // Verify "Add User" Text
        String expectedMsg1 = "Add User";
        Assert.assertEquals(actualMsg, expectedMsg, "Add Users text verified");
        adduserPage.selectUserRoleDropdown();
        adduserPage.enterEmployeeName();
        adduserPage.selectStatusDropDown();
        adduserPage.Username("David Morris");
        adduserPage.Password("Apple123@");
        adduserPage.ConfirmPasswordField("Apple123@");
        adduserPage.clickonSaveButton();
        //verify message sucessfully saved
    }
    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginpage.UsernameField("Admin");
        loginpage.PasswordField("admin123");
        loginpage.clickLoginbutton();
        homePage.clickonAdminTab();
        String actualMsg = viewSystemUsersPage.SystemUsersText(); // Verify "System Users" Text
        String expectedMsg = "System Users";
        Assert.assertEquals(actualMsg, expectedMsg, "System Users text verified");
        viewSystemUsersPage.usernameField("David Morris");
        viewSystemUsersPage.selectStatusDropDown();
        viewSystemUsersPage.clickonSearchButton();
        //verify user should be in result list
    }
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        loginpage.UsernameField("Admin");
        loginpage.PasswordField("admin123");
        loginpage.clickLoginbutton();
        homePage.clickonAdminTab();
        String actualMsg = viewSystemUsersPage.SystemUsersText();
        String expectedMsg = "System Users";
        Assert.assertEquals(actualMsg, expectedMsg, "System Users text verified");
        adduserPage.Username("David Morris");
        viewSystemUsersPage.selectUserRoleDropdown();
        viewSystemUsersPage.selectStatusDropDown();
        viewSystemUsersPage.clickonSearchButton();
        //Verify the User should be in Result list.
        viewSystemUsersPage.clickonCheckbox();
        viewSystemUsersPage.clickonDeleteButton();
        viewSystemUsersPage.clickonPopupDeleted();
        //Click on Ok Button on Popup

    }
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        loginpage.UsernameField("Admin");
        loginpage.PasswordField("admin123");
        loginpage.clickLoginbutton();
        homePage.clickonAdminTab();
        String actualMsg = viewSystemUsersPage.SystemUsersText(); // Verify "System Users" Text
        String expectedMsg = "System Users";
        Assert.assertEquals(actualMsg, expectedMsg, "System Users text verified");
        adduserPage.Username("David Morris");
        viewSystemUsersPage.selectUserRoleDropdown();
        viewSystemUsersPage.selectStatusDropDown();
        viewSystemUsersPage.clickonSearchButton();
        String actualMsg1 = viewSystemUsersPage.verifyNOrecordFound(); //verify message "No Records Found"
        String expectedMsg1 = "No Record Found";
        Assert.assertEquals(actualMsg, expectedMsg, "Not Found text verified");

    }
    }


