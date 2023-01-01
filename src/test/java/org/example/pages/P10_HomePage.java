package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.example.stepDefinitions.Hooks.driver;

public class P10_HomePage {

    @FindBy(className = "header-menu" )
    WebElement headerMenu;

    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[@href='/apparel']")
    WebElement apparelLink;

    @FindBy(xpath = "//div[@class='picture']//a[@href='/shoes']")
    WebElement shoesLink;

    @FindBy(xpath="//h1[contains(text(), 'Shoes')]")
    public WebElement shoesTitle;

    @FindBy(xpath = "//div[@class='filter-content']")
    WebElement filterColor;

    @FindBy(tagName = "li")
    List <WebElement> allColors;

    @FindBy(xpath="//input[@id='attribute-option-15']")
    public WebElement redcolor;

    public WebElement Currency_List(){
            return driver.findElement(By.id("customerCurrency"));
        }

    public List<WebElement> prices()
    {
       return driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement SearchField(){
            return  driver.findElement(By.id("small-searchterms"));
        }

    public WebElement SearchButton(){
            return driver.findElement(By.className("button-1"));
    }

    public List<WebElement> ProductItems()
    {
        return driver.findElements(By.className("product-item"));
    }

    public WebElement ProductImage(){
        return   driver.findElement(By.cssSelector("img[alt=\"Picture of Nike Floral Roshe Customized Running Shoes\"]"));
    }

    public List<WebElement> Sliders(){
        return driver.findElements(By.className("nivo-imageLink"));
    }

    public WebElement youtube(){
        return  driver.findElement(By.className("youtube"));
    }

    public WebElement Facebook(){
        return  driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement Twitter(){
        return  driver.findElement(By.className("twitter"));
    }

    public WebElement rss(){
        return driver.findElement(By.className("rss"));
    }

    public List<WebElement> Parent (){
        return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>Li>a[href]"));
    }

    public List<WebElement> Childs (int num){
        return  driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/Li[" + num + "]/ul[@class=\"sublist first-level\"]/li"));
    }

    public WebElement title(){
        return  driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

    public void selectColor(String selectColor)
    {
        for (WebElement color: allColors)
        {
            if(color.getText().equals(selectColor)) {
                color.click();
            }
        }
    }
    public void openShoesCategory()
	{
		clickButton(shoesLink);
	}

    public void ShoesCategory()
    {
        shoesLink.click();
    }

    public void openApprealCategory()
    {
        apparelLink.click();
    }
    protected static void clickButton(WebElement button)
    {
        button.click();
    }

  }
