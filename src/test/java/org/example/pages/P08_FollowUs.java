package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefinitions.Hooks.driver;

public class P08_FollowUs {

    public WebElement facebook(){
       return driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitter(){
        return driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }

   // public WebElement rss(){
      //  return driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
  //  }

    public WebElement rss(){
        return driver.findElement(By.className("rss"));
    }

    public WebElement youtube(){
        return driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }


}
