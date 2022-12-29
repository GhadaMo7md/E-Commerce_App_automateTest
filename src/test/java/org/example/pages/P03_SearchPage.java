package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.pages.P01_Register.setTextElementText;
import static org.example.stepDefinitions.Hooks.driver;


public class P03_SearchPage {


    P02_Login Login_Opj = new P02_Login(driver);

    public void UserLogin(String email, String password)
    {
        setTextElementText(Login_Opj.emailTxtBox, email);
        setTextElementText(Login_Opj.passwordTxtBox, password);
        Login_Opj.submitButton.click();
    }

    public List<WebElement> productsNList(){

        List<WebElement> productTitle = driver.findElements(By.className("product-title"));

        return productTitle;
    }

    public List<WebElement> serialNumList(){

        List<WebElement> serialNumber = driver.findElements(By.cssSelector("div[class=\"sku\"] > span[class=\"value\"]"));

        return serialNumber;
    }

    public WebElement search_Box(){
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement search_Button(){
        return driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }

    public WebElement product_found(){
        return driver.findElement(By.cssSelector("h2[class=\"product-title\"] > a[href=\"/lenovo-thinkpad-x1-carbon-laptop\"]"));
    }
}
