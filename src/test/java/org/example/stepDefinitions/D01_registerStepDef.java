package org.example.stepDefinitions;

import org.example.testRunner.runners;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_Register register = new P01_Register();

    @Given("user navigate to Register Page")
    public void registerPage() {
        register.registerLink.click();
    }

    @When("User enter valid data")
    public void insertValidData() {
        register.Regestration("Ghada7899", "Mohamed", "ghadamohamed02292@mail.com", "1234567", "1234567");
    }

    @Then("user should register successfully")
    public void userRegisterSuccessfully()
    {
        Assert.assertTrue(register.successMessage.getText().contains("Your registration completed"));
    }

//    @Then("user should register successfully")
//    public void successful_Registration() {
//            register.successMessage.;
//    }


//    @Then("user should register successfully")
//    public void userRegisterSuccessfully()
//    {
//        Assert.assertTrue(register.successMessage.getText().contains("Your registration completed"));
//    }


}
//
//    @Then()





