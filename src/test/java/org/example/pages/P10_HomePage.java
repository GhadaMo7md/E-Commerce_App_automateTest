package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P10_HomePage {


        public WebElement Currency_List(){
            return Hooks.driver.findElement(By.id("customerCurrency"));
        }

        public List<WebElement> prices()
        {
            return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        }

        public WebElement SearchField(){
            return  Hooks.driver.findElement(By.id("small-searchterms"));
        }

        public WebElement SearchButton(){
            return Hooks.driver.findElement(By.className("button-1"));
        }

        public List<WebElement> ProductItems()
        {
            return Hooks.driver.findElements(By.className("product-item"));

        }

        public WebElement ProductImage(){
            return   Hooks.driver.findElement(By.cssSelector("img[alt=\"Picture of Nike Floral Roshe Customized Running Shoes\"]"));
        }

        public List<WebElement> Sliders(){
            return Hooks.driver.findElements(By.className("nivo-imageLink"));
        }

        public WebElement youtube(){
            return  Hooks.driver.findElement(By.className("youtube"));
        }

        public WebElement Facebook(){
            return  Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
        }

        public WebElement Twitter(){
            return  Hooks.driver.findElement(By.className("twitter"));
        }

        public WebElement rss(){
            return Hooks.driver.findElement(By.className("rss"));
        }

        public List<WebElement> Parent (){
            return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>Li>a[href]"));
        }

        public List<WebElement> Childs (int num){
            return  Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/Li[" + num + "]/ul[@class=\"sublist first-level\"]/li"));
        }

        public WebElement title(){
            return  Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        }


    }
