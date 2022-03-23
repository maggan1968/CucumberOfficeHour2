package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch {

    GoogleSearchPage searchPage = new GoogleSearchPage();

    @Given("user is on google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("user searches SDET")
    public void user_searches_sdet() {
        searchPage.searchBar.sendKeys("SDET"+ Keys.ENTER);
    }
    @Then("user should see SDET in title")
    public void user_should_see_sdet_in_title() {

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle = "SDET";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
