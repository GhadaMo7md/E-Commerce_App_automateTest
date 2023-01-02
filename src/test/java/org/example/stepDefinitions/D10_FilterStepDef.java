package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_HomePage;

import org.testng.Assert;

import static org.example.stepDefinitions.Hooks.driver;


public class D10_FilterStepDef  {

    P10_HomePage homeObject = new P10_HomePage();


    @Given("Click on Appreal category")
    public void clickOnCategory()
    {
        homeObject.openApprealCategory();
    }

    @When("User click on Shoes category")
    public void clickOnSubCategory()
    {
        homeObject.openShoesCategory();
    }

    @Then("Shoes page category page opens successfully")
    public void shoesPageOpens()
    {
        Assert.assertTrue(homeObject.shoesTitle.getText().contains("Shoes"));
    }

    @And("User select color filter")
    public void selectColor()
    {
        homeObject.selectColor("Red");
    }

    @Then("Color filter selected")
    public void colorFilterSelected()
    {
        Assert.assertTrue(homeObject.redcolor.isSelected());
    }
}
