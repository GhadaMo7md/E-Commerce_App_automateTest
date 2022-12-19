package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.example.pages.P02_Login;
import org.openqa.selenium.support.FindBy;

public class D02_loginStepDef
{
    P02_Login Login = new P02_Login();

    @Given("user open the login page")
    public void openLoginPage()
    {
        Login.loginLink.click();
    }

    @When("user enter valid Email and Password")
    public void enterValidData()
    {
        Login.UserLogin("ghada.mohamed@gmail.com","1234567");
    }


}
