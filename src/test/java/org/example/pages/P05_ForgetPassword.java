package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.stepDefinitions.Hooks.driver;
import static org.example.pages.P01_Register.setTextElementText;

public class P05_ForgetPassword {


    public WebElement resetPassword(){
        return driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }

    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement recoverButton(){
        return driver.findElement(By.cssSelector("button[name=\"send-email\"]"));
    }
}
