package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.example.pages.P03_SearchPage;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.stepDefinitions.Hooks.driver;

public class D03_searchStepDef
{
    P02_Login Login = new P02_Login(driver);
    P03_SearchPage searchObject = new P03_SearchPage();

    @Given("user clicked on Login & enter valid Email and Password")
    public void UserLogin() {
        Login.loginLink.click();
        Login.UserLogin("ghada@gmail.com","ghada222");
        Login.submitData();
    }

    @When("user click on search box and write {string}")
    public void searchBox(String productName){

        searchObject.search_Box().sendKeys(productName);
    }

    @And("user press on the search button")
    public void searchButton(){

        searchObject.search_Button().click();
    }


    @Then("{string} should appear successfully")
    public void productFoundSuccess(String productName){

        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));

        System.out.println("Number of search results is: " + searchObject.productsNList().size());

        for(int i=0 ; i < searchObject.productsNList().size() ; i++) {
            Assert.assertTrue(searchObject.productsNList().get(i).getText().toLowerCase().contains(productName));
        }

    }


    @And("user click on the product in search result")
    public void clickOnProduct(){

        driver.findElement(By.cssSelector("div[class=\"picture\"]")).click();

    }


    @Then("{string} should appear successfully in product page")
    public void serialNFound(String serialNumber){

        int i = 0;
        Assert.assertTrue(searchObject.serialNumList().get(i).getText().contains(serialNumber));

    }

}
