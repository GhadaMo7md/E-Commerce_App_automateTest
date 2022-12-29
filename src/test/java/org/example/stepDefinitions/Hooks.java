package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;


import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver= null;


    @Before
    public static void openBrowser(){

//        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
//        System.out.println(chromePath);
//        System.setProperty("WebDriver.chrome.driver", chromePath);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://demo.nopcommerce.com/");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public static void quitDriver() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
    }
}
