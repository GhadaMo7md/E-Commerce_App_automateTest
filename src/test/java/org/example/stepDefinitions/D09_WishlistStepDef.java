package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P09_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefinitions.Hooks.driver;

public class D09_WishlistStepDef {

    P09_Wishlist wishlist = new P09_Wishlist();


    @When("user clicks on the wishlist button")
    public void click_wishlist(){

        wishlist.wishlist_btn().get(2).click();
    }

    @Then("the product is added to wishlist and success message appears")
    public void wishlist_success(){

        SoftAssert soft = new SoftAssert();

        String expectedResult = "The product has been added to your ";
        String actualResult = wishlist.successMsg().getText();

        soft.assertTrue(actualResult.contains(expectedResult));
        String Msg_backgroundColor = wishlist.successMsg().getCssValue("background-color");
        soft.assertEquals(Msg_backgroundColor, "rgba(75, 176, 122, 1)");

        soft.assertAll();
    }


    @And("user waits until success message disappears and clicks on wishlist Tab")
    public void click_wishlistTab(){

        Assert.assertTrue(new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class=\"bar-notification success\"]"))));

        wishlist.wishlistTab().click();
    }


    @Then("product is existed in the wishlist")
    public void product_exists(){

       String quantity = driver.findElement(By.className("qty-input")).getAttribute("Value");
       Assert.assertNotEquals(quantity , "0");
    }


}
