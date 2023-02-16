package com.orange.pages;

import com.orange.utility.Utility;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sun.security.util.Password;

import java.awt.*;

//- Store usename, password, Login Button and LOGIN Panel text Locators
//and create appropriate methods for it.
public class LoginPage extends Utility {

    By UsernameField = By.name("username");
    By PasswordField = By.name("password");
    By Loginbutton = By.xpath("//button[@type='submit']");
    By LoginPanel = By.xpath("//div[@class='orangehrm-login-form']");
    By LoginpanelText = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");

    public String LoginpanelText(){
        return getTextFromElement(LoginpanelText);
    }
    public void UsernameField(String Username){
        sendTextToElement(UsernameField,Username);
    }
    public void PasswordField(String Password){
        sendTextToElement(PasswordField,Password);
    }
    public void clickLoginbutton(){
        clickOnElement(Loginbutton);
    }
    public String LoginPanelForm(){
        return getTextFromElement(LoginPanel);
    }
}



