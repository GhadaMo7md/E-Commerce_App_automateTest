package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D04_currencyStepDef
{
    P10_HomePage currency = new P10_HomePage() ;
   // P04_Currency currency = new P04_Currency();

    @When("User click on Currency drop-down-list and select Euro")
    public void Currency_dropdown() throws InterruptedException {

        Select Currency = new Select(currency.Currency_List());
        Currency.selectByVisibleText("Euro");

        Thread.sleep(3000);
    }

    @Then("Euro Symbol is shown on the 4 products displayed in Home page")

    public void Currency_validation() {

        String expectedResult[] =new String[] {"€1032.00" ,"€1548.00" , "€210.70" , "€21.50"};

        for (int i = 0; i < currency.prices().size(); i++) {
            String actualResult = currency.prices().get(i).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("€"));
            Assert.assertTrue(actualResult.contains(expectedResult[i]));
        }
    }

}

