package com.betterroaming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.PlanPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BetterRoamingTest {
	private WebDriver driver;
    private HomePage homePage;
    private PlanPage planPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        driver.get("https://www.betterroaming.com/");
        homePage = new HomePage(driver);
        planPage = new PlanPage(driver);
    }

    @Test
    public void validateSecondPlanDetails() {
        homePage.selectCurrency("Euro");
        homePage.clickOnThailand();

        String expectedCountry = "Thailand";
        String expectedData = "5GB";
        String expectedValidity = "30 days";
        String expectedPlanType = "data only";
        String expectedPrice = "9,29 €";  // Update the expected price dynamically if needed

        Assert.assertEquals(planPage.getSecondPlanCountry(), expectedCountry, "Country mismatch");
        Assert.assertEquals(planPage.getSecondPlanData(), expectedData, "Data mismatch");
        Assert.assertEquals(planPage.getSecondPlanValidity(), expectedValidity, "Validity mismatch");
        Assert.assertEquals(planPage.getSecondPlanType(), expectedPlanType, "Plan type mismatch");
        Assert.assertEquals(planPage.getSecondPlanPrice(), expectedPrice, "Price mismatch");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
