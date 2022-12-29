package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.testng.Assert;

import static org.example.stepDefinitions.Hooks.driver;

public class D02_loginStepDef
{
      P02_Login Login_Opj = new P02_Login(driver);

//Scenario-1
    @Given("user open the login page")
    public void openLoginPage()
    {
        Login_Opj.loginLink.click();
    }

    @When("user enter valid Email and Password")
    public void enterValidData()
    {
        Login_Opj.UserLogin("ghada@gmail.com","ghada222");
    }

    @And("user click on login button")
    public void loginButton()
    {
        Login_Opj.submitData();
    }

    @Then("user should be login successfully")
    public void Login_Success() {
            Assert.assertTrue(Login_Opj.logoutLink.getText().contains("Log out"));
    }

    @And("User click on logout button")
    public void userClickLogoutBtn(){
        Login_Opj.logoutLink.click();
    }

    @Then("User could logout successfully")
    public void logout_Success(){
        Assert.assertTrue(Login_Opj.loginLink.getText().contains("Log in"));
    }

//////////////////////////////////////////////////////////////////

//Scenario-2
    @Given("user2 open the login page")
    public void LoginPage()
{
    Login_Opj.loginLink.click();
}

    @When("user2 enter valid Email and Password")
    public void enterInValidData()
    {
        Login_Opj.UserLogin("test@test.com","WrongPassword");
    }

    @And("user2 click on login button")
    public void loginBtn()
    {
        Login_Opj.submitData();
    }

    @Then("user2 should not login successfully")
    public void failed_login() {

        Login_Opj.failed_login();
    }





}
