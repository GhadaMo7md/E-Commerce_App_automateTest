package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;

public class D04_currencyStepDef
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
