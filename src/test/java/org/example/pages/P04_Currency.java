package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class P04_Currency {

    P04_Currency currencyObject = new P04_Currency();
    Select select;

    @FindBy(id="customerCurrency")
    public WebElement currency_Dropdown;

    @FindBy(name="customerCurrency")
    public WebElement currency_Selector;

    @FindBy(css = "span[class=\"price actual-price\"]" )
    public WebElement prices_Currency;

    @FindBy(css = "span[class=\"price actual-price\"]")
    public WebElement USD_Price;

    @FindBy(xpath = "//*[@id=\"customerCurrency\"]/option[2]")
    public WebElement euro_Price;


    public void changeCurrencyToEuro()
    {
        select = new Select(currency_Dropdown);
        select.selectByVisibleText("Euro");
    }

    public void changeCurrencyToDollar()
    {
        select = new Select(currency_Dropdown);
        select.selectByVisibleText("US Dollar");
    }

    public List<WebElement> prices_Currency(){
        List<WebElement> costCurrency = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")); //[$1,200.00 ,$1,800.00 , $245.00 , $25.00]
        return costCurrency;
    }

    public WebElement currency_Selector(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement usDollar_currency(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement euro_currency(){
        return Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fsearch%3Fq%3DLenovo%2520Thinkpad%2520X1%2520Carbon%2520Laptop\"]"));
    }
}
