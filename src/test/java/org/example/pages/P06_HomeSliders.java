package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefinitions.Hooks.driver;

public class P06_HomeSliders {

    public List<WebElement> slider(){

//        List<WebElement> sliders = driver.findElements(By.cssSelector("div[id=\"nivo-slider\"]>a[href=\"http://demo.nopcommerce.com/\"]"));
//        return sliders;

            return Hooks.driver.findElements(By.className("nivo-imageLink"));
        }

}
