package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;


public class P02_Login {

    public   P02_Login ()
    {
        PageFactory.initElements(Hooks.driver, this);
    }

     @FindBy(className = ("ico-login")
     public WebElement loginLink;

     @FindBy(id = "Email")
     WebElement emailTxtBox;

     @FindBy(id = "Password")
     WebElement passwordTxtBox;



}
