package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_HomeSliders;
import org.example.pages.P07_HoverCategories;
import org.testng.Assert;

import static org.example.stepDefinitions.Hooks.driver;

public class D06_HomeSlidersStepDef {

    P06_HomeSliders slider = new P06_HomeSliders();


    @When("user clicks on the Nokia Lumia 1020 slider")
    public void click_NokiaSlider(){

        slider.slider().get(0).click();
    }


    @Then("user should be directed to iPhone page")
    public void nokia_Page(){

        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");

    }


    @When("user clicks on the iPhone slider")
    public void click_IPhoneSlider(){

        slider.slider().get(0).click();
    }


    @Then("user should be directed to Nokia Lumia 1020 page")
    public void iphone_Page(){

        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");

    }
}
