package com.orange.pages;
//UserManagement, Job, Organization Tabs Locators and it's actions

import com.orange.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By UserManagementTab = By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']");
    By JobTab = By.xpath("div[@class='oxd-topbar-body']/nav/ul/li[3]");
    By OrganizationTab = By.xpath("div[@class='oxd-topbar-body']/nav/ul/li[3]");

    public void selectUserManagementTab(String User){
        selectByVisibleTextFromDropDown(UserManagementTab,User);
    }
    public void selectJobTab(String Job){
        selectByVisibleTextFromDropDown(JobTab,Job);
    }
    public void selectOrganizationTab(String Organization){
        selectByVisibleTextFromDropDown(OrganizationTab,Organization);
    }
}
