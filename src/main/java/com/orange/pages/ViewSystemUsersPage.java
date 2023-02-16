package com.orange.pages;
//System Users Text, Username Field, User Roll dropDown,Employee Name Field,Status Drop Down, Search Button,
// Reset Button, Add Button and Delete Button locators and it's actions

import com.orange.utility.Utility;
import org.openqa.selenium.By;


public class ViewSystemUsersPage extends Utility {
    By SystemUsersText = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
    By UsernameField = By.xpath("//div[@class='oxd-form-row']/div/div[1]");
    By UserRoleDropdown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[2]/div/div[2]");
    By EmployeeNameField = By.xpath("//div[@class='oxd-autocomplete-text-input--before']");
    By StatusDropDown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]");
    By SearchButton = By.xpath("//div[@class='oxd-form-actions']/button[2]");
    By ResetButton = By.xpath("//div[@class='oxd-form-actions']/button[1]");
    By AddButton = By.xpath("//div[@class='orangehrm-header-container']/button[1]");
    By DeleteButton = By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]/i");
    By Checkbox = By.xpath("//div[@class='oxd-table-body']/div[1]/div/div//div/label//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']");
    By PopupDeleted = By.xpath("//div[@class='orangehrm-modal-footer']/button[2]//i[@class='oxd-icon bi-trash oxd-button-icon']=deletepopup");
    By EnableStatus = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]==enable status");
    By enstatusDrodown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]");
    By ResultList = By.xpath("Result list==//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//span[text()='(1) Record Found']");
    By UserText= By.linkText("Users");
    By NoRecordfound = By.linkText("No Record Found");
    By AdminDropdown=By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By David = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'David Morris')]");

    public String SystemUsersText() {
        return getTextFromElement(SystemUsersText);
    }

    public void usernameField(String username) {
        sendTextToElement(UsernameField, username);
    }

    public void selectenstatusveiwDropdown() throws InterruptedException {
        clickOnElement(enstatusDrodown);
        Thread.sleep(1000);
        clickOnElement(EnableStatus);
    }
    public void selectUserRoleDropdown()throws InterruptedException{
       clickOnElement(UserRoleDropdown);
        Thread.sleep( 1500);
        clickOnElement(AdminDropdown);
    }
    public void selectStatusDropDown()throws InterruptedException {
        clickOnElement(StatusDropDown);
        Thread.sleep(1000);
        clickOnElement(StatusDropDown);
    }
        public void enterEmployeeName()throws InterruptedException{
        sendTextToElement(EmployeeNameField,"P");
        Thread.sleep(2000);
         clickOnElement(David);
    }
    public void clickonSearchButton() {
        clickOnElement(SearchButton);
    }
    public void clickonResetButton() {
        clickOnElement(ResetButton);
    }

    public void clickonAddButton() {
        clickOnElement(AddButton);
    }

    public void clickonDeleteButton() {
        clickOnElement(DeleteButton);
    }
    public String verifyUserText(){
        return getTextFromElement(UserText);
    }
    public String verifyResultList(){
        return getTextFromElement(ResultList);
    }
    public void clickonCheckbox(){
        clickOnElement(Checkbox);
    }
    public void clickonPopupDeleted() {
        clickOnElement(PopupDeleted);
    }
    public String verifyNOrecordFound(){
        return getTextFromElement(NoRecordfound);
    }

}
