package com.orange.testsuite;

import com.orange.pages.*;
import com.orange.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginpage= new LoginPage();
    HomePage homePage= new HomePage();
    @Test
    public void verifyUserShouldLoginSuccessFully(){
        loginpage.UsernameField("Admin");
        loginpage.PasswordField("admin123");
        loginpage.clickLoginbutton();
        String actualMsg = homePage.WelcomeText(); // Verify welcome Text
        String expectedMsg = "Dashboard";
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome text verified");
    }
    @Test
    public void verifyThatTheLogoDisplayOnHomePage(){
        loginpage.UsernameField("Admin");
        loginpage.PasswordField("admin123");
        loginpage.clickLoginbutton();
        String actualMsg = homePage.WelcomeText(); // Verify welcome Text
        String expectedMsg = "Dashboard";
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome text verified");
        homePage.OrangeHRMLogo();
    }
    @Test
    public void verifyUserShouldLogOutSuccessFully(){
        loginpage.UsernameField("Admin");
        loginpage.PasswordField("admin123");
        loginpage.clickLoginbutton();
        homePage.clickandHooverLogout();
        homePage.clickonUserProfilelogo();
        String actualMsg = loginpage.LoginPanelForm();// Verify login panel Text
        String expectedMsg = "Login";
        Assert.assertEquals(actualMsg, expectedMsg, "Login Panel text verified");

    }

    }


