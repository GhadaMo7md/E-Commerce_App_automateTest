package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_HomeSliders;
import org.example.pages.P07_HoverCategories;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefinitions.Hooks.driver;

public class D06_HomeSlidersStepDef {

    P06_HomeSliders slider = new P06_HomeSliders();

    @When("User Click on Nokia Slider")
    public void Nokia_Slider(){

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(slider.slider().get(0),"style", "display: block;"));
        slider.slider().get(0).click();

    }
    @Then("Nokia URL shall be appeared")
    public void Success(){
        SoftAssert soft=new SoftAssert();
        String ExpectedResult = "https://demo.nopcommerce.com/nokia-lumia-1020";
        soft.assertEquals(Hooks.driver.getCurrentUrl(),ExpectedResult,"error");
        soft.assertAll();
    }

    @When("User click on iphone slider")
    public void Second_Slider(){

        WebDriverWait wait2 = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));

        wait2.until(ExpectedConditions.attributeContains(slider.slider().get(1),"style","display: none;"));
        slider.slider().get(1).click();
    }

    @Then("Iphone URL shall be appeared")
    public void Iphone(){
        SoftAssert S = new SoftAssert();
        S.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
        S.assertAll();
    }
//
//    @When("user clicks on the Nokia Lumia 1020 slider")
//    public void click_NokiaSlider(){
//
//        slider.slider().get(0).click();
//    }
//
//
//    @Then("user should be directed to iPhone page")
//    public void nokia_Page(){
//
//        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
//
//    }
//
//
//    @When("user clicks on the iPhone slider")
//    public void click_IPhoneSlider(){
//
//        slider.slider().get(0).click();
//    }
//
//
//    @Then("user should be directed to Nokia Lumia 1020 page")
//    public void iphone_Page(){
//
//        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
//
//    }
}
