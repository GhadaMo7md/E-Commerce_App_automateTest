package org.example.stepDefinitions;

import org.example.testRunner.runners;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D01_registerStepDef {

    P01_Register register = new P01_Register();
    P01_Register pageObj;


    @Given("user navigate to Register Page")
    public void registerPage()
    {
        register.registerLink.click();
    }

    @When("User enter valid data")
    public void insertValidData()
    {
        P01_Register pageObj = new P01_Register();
        pageObj.Regestration("test", "test", "test1234@mail.com", "12345678", "12345678");

    }



//    @And()("User enter invalid data")
//
//    @Then()




}
