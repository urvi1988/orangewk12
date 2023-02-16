package com.orange.pages;

import com.orange.utility.Utility;
import org.openqa.selenium.By;

//- Store OrangeHRM logo, Admin, PIM, Leave,Dashboard, Welcome Text
//locatores
public class HomePage extends Utility {
    By OrangeHRMLogo=By.xpath("//div[@class='oxd-brand-banner']/img");
    By AdminTab= By.xpath("//nav[@class='oxd-navbar-nav']/div[2]/ul/li[1]");
    By PIMTab = By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[2]");
    By LeaveTab = By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[3]");
    By DashboardTab = By.xpath("/div[@class='oxd-sidepanel-body']/ul/li[3]");
    By WelcomeText= By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    By UserProfileLogo = By.xpath("//div[@class='oxd-topbar-header']/div[2]/ul/li/span");
    By MouseHooverLogout= By.linkText("Logout");

    public void clickandHooverLogout(){
        mouseHoverToElementAndClick(MouseHooverLogout);
    }
    public void clickonUserProfilelogo(){
        clickOnElement(UserProfileLogo);
    }
    public String OrangeHRMLogo(){
        return getTextFromElement(OrangeHRMLogo);
    }
    public void clickonAdminTab(){
        clickOnElement(AdminTab);
    }
    public String PIMTab() {
        return getTextFromElement(PIMTab);
    }
    public String LeaveTab(){
        return getTextFromElement(LeaveTab);
    }
    public String DashboardTab(){
        return getTextFromElement(DashboardTab);
    }
    public String WelcomeText() {
        return getTextFromElement(WelcomeText);
    }


    }
