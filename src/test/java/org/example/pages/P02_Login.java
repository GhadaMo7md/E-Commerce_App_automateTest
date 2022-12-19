package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import static org.example.pages.P01_Register.setTextElementText;


public class P02_Login {

    public   P02_Login ()
    {
        PageFactory.initElements(Hooks.driver, this);
    }

     @FindBy(className = ("ico-login"))
     public WebElement loginLink;

     @FindBy(id = "Email")
     WebElement emailTxtBox;

     @FindBy(id = "Password")
     WebElement passwordTxtBox;

    public void UserLogin(String email, String password)
    {
        setTextElementText(emailTxtBox, email);
        setTextElementText(passwordTxtBox, password);
    }



}
