package com.orange.pages;
//User Role Drop Down, Employee Name, Username, Status Drop Down,
//Password, Confirm Password,
//Save and Cancle Button Locators and it's actions

import com.orange.utility.Utility;
import org.openqa.selenium.By;

public class AdduserPage extends Utility {

   By UserRoleDropdown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By EmployeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By Username = By.xpath("//div[@class='oxd-form-row']/div/div[1]");
    By StatusDropDown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]");
    By Password = By.name("password");
    By ConfirmPasswordField = By.name("confirmpassword");
    By SaveButton = By.xpath("//div[@class='orangehrm-card-container']/form/div[3]/button[2]");
    By CancleButton = By.xpath("//div[@class='orangehrm-card-container']/form/div[3]/button[1]");
    By AdduserText = By.xpath("//div[@class='orangehrm-card-container']/h6");
    By AdminDropdown = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By DisabledDropDown = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By David  = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'David Morris')]");

    public void selectStatusDropDown() throws InterruptedException {
        clickOnElement(StatusDropDown);
        Thread.sleep(2500);
        clickOnElement(DisabledDropDown);
    }

    public void selectUserRoleDropdown() throws InterruptedException {
        clickOnElement(UserRoleDropdown);
        Thread.sleep(1200);
        clickOnElement(AdminDropdown);
    }

    public void enterEmployeeName() throws InterruptedException {
        sendTextToElement(EmployeeNameField, "D");
        Thread.sleep(2000);
        clickOnElement(David);
    }

    public void Username(String username) {
        sendTextToElement(Username , username);
    }

    public void Password(String password) {
        sendTextToElement(Password, password);
    }

    public void ConfirmPasswordField(String confirmpassword) {
        sendTextToElement(ConfirmPasswordField, confirmpassword);
    }

    public void clickonSaveButton() {
        clickOnElement(SaveButton);
    }

    public void clickonCancleButton() {
        clickOnElement(CancleButton);
    }

    public String AddUsersText() {
        return getTextFromElement(AdduserText);
    }
}
