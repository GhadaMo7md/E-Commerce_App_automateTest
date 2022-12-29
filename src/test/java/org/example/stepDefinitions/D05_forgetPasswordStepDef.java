package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.example.pages.P05_ForgetPassword;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.stepDefinitions.Hooks.driver;

public class D05_forgetPasswordStepDef {

    P05_ForgetPassword Pass = new P05_ForgetPassword();
    P02_Login Login_Opj = new P02_Login(driver);

    @Given("user goes to login page")
    public void openLoginPage()
    {
        Login_Opj.loginLink.click();
    }

    @And("user click on forgot password")
    public void forgotPassword(){

        Pass.resetPassword().click();
    }

    @When("user enters his registered email")
    public void recoverEmail(){

        Pass.email().sendKeys("ghada@gmail.com");
    }

    @And("press on Recover button")
    public void recoverBtn(){

        Pass.recoverButton().click();
    }

    @Then("user should reset his password successfully")
    public void successReset(){

        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = driver.findElement(By.className("content")).getText();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}
