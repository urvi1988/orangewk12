package com.orange.pages;

import com.orange.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By DashboardText = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");

    public String verifyDashboardText(){
        return getTextFromElement(DashboardText);
    }
}
