package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_HoverCategories;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

import static org.example.stepDefinitions.Hooks.driver;

public class D07_HoverCategoriesStepDef {

    P07_HoverCategories hCat = new P07_HoverCategories();

    @When("user select random one of the three main categories")
    public void categorySelection(){

        int randomNumber = new Random().nextInt(3);

        Actions hover = new Actions(driver);

        hover.moveToElement(hCat.categories().get(randomNumber)).perform();
    }


    @Then("user could hover on sub categories of the selected main category")
    public void hoverSubCategory(){


        int RandomNumber1 = new Random().nextInt(3);
        int RandomNumber2 = new Random().nextInt(6);
        int RandomNumber3 = new Random().nextInt(9);

        String subTitle = "a";

        if(hCat.desktop().isDisplayed() || hCat.notebooks().isDisplayed() || hCat.software().isDisplayed())
        {
            Actions hover = new Actions(driver);
            hover.moveToElement(hCat.subCategories().get(RandomNumber1)).perform();
            subTitle = hCat.subCategories().get(RandomNumber1).getText();
            hCat.subCategories().get(RandomNumber1).click();
        }

        else if(hCat.cellphones().isDisplayed() || hCat.others().isDisplayed() || hCat.camera_and_photo().isDisplayed())
        {
            Actions hover = new Actions(driver);
            hover.moveToElement(hCat.subCategories().get(RandomNumber2)).perform();
            subTitle = hCat.subCategories().get(RandomNumber2).getText();
            hCat.subCategories().get(RandomNumber2).click();
        }


        else if(hCat.clothing().isDisplayed() || hCat.accessories().isDisplayed() || hCat.shoes().isDisplayed())
        {
            Actions hover = new Actions(driver);
            hover.moveToElement(hCat.subCategories().get(RandomNumber3)).perform();
            subTitle = hCat.subCategories().get(RandomNumber3).getText();
            hCat.subCategories().get(RandomNumber3).click();
        }
        else
            Assert.assertTrue(hCat.subPage_Title().getText().contains(subTitle));
    }
}
