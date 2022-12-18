package org.example.stepDefinitions;

import org.example.testRunner.runners;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_Register register = new P01_Register();
    P01_Register pageObj;


    @Given("user navigate to Register Page")
    public void registerPage() {
        register.registerLink.click();
    }

    @When("User enter valid data")
    public void insertValidData() {
        P01_Register pageObj = new P01_Register();
        pageObj.Regestration("Ghada2", "Mohamed", "ghmohamed@mail.com", "1234567", "1234567");
    }
//    @And("And User click on register button")
//    public  void clickRegisterButton()
//    {
//        register.clickRegisterButton();
//    }

    @Then("user Should register successfully")
    public void userRegisterSuccessfully()
    {
        register.successful_Registration();
    }
//    @Then("user should register successfully")
//    public void successful_Registration() {
//            register.successMessage.;
//    }





}
//
//    @Then()





