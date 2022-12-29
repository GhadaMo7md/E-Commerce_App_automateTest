package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static org.example.pages.P01_Register.setTextElementText;


public class P02_Login {

    WebDriver driver ;

    public   P02_Login(WebDriver driver)
    {
        PageFactory.initElements(Hooks.driver, this);
    }

     @FindBy(className = ("ico-login"))
     public WebElement loginLink;

     @FindBy(id = "Email")
     WebElement emailTxtBox;

     @FindBy(id = "Password")
     WebElement passwordTxtBox;

     @FindBy(className= "login-button")
     public WebElement submitButton;

    @FindBy(className = "result")
    public WebElement successMessage;

    @FindBy(linkText = "Log out")
    public WebElement logoutLink;

     @FindBy(css = ("div[class=\"message-error validation-summary-errors\"]"))
     public WebElement actualResult;

     @FindBy(css = ("div[class=\"message-error validation-summary-errors\"]"))
     public WebElement msg_Color;

    public void UserLogin(String email, String password)
    {
        setTextElementText(emailTxtBox, email);
        setTextElementText(passwordTxtBox, password);
        //submitButton.click();
    }

    public void submitData(){
        submitButton.click();
    }

    public void failed_login()
    {
        SoftAssert soft = new SoftAssert();

        String expectedResult = "Login was unsuccessful.";
        String actualResult;
        actualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getText();
        String msgColor;
        msgColor = Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getCssValue("color");
        String message_Color ;
        System.out.println(msg_Color);
        soft.assertEquals(msgColor, "rgba(228, 67, 75, 1)");

        soft.assertAll();


    }

}
