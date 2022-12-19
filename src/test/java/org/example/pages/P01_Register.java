package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public  class P01_Register {

    WebDriver driver;
    P01_Register registerObject;
    P02_Login LoginObject;
    P03_Search HomeObject;

    public  P01_Register ()
    {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerLink;

    protected static void clickButton(WebElement button)
    {
        button.click();
    }

    protected static void setTextElementText(WebElement textElement, String value)
    {
        textElement.sendKeys(value);
    }

    @FindBy(id = "gender-male")
    WebElement genderRadioBtn;

    @FindBy(id = "FirstName")
    WebElement fnTxtBox;

    @FindBy(id = "LastName")
    WebElement lnTxtBox;

    @FindBy(id = "Email")
    WebElement emailTxtBox;

    @FindBy(id = "Password")
    WebElement passwordTxtBox;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmpasswordTxtBox;

    @FindBy(id = "register-button")
    WebElement registerBtn;


    @FindBy(className = "result")
    public WebElement successMessage;



    //@FindBy(className = "page-title")
    public void Regestration (String fname,String lname,String email,String pass,String Cpass )
    {
        fnTxtBox.sendKeys(fname);
        lnTxtBox.sendKeys(lname);
        emailTxtBox.sendKeys(email);
        passwordTxtBox.sendKeys(pass);
        confirmpasswordTxtBox.sendKeys(Cpass);
        registerBtn.click();
    }


}
