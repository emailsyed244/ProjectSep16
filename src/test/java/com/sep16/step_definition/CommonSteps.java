package com.sep16.step_definition;

import com.sep16.configuration.WebConnect;
import com.sep16.pages.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

/**
 * Created by UC181137 on 16/09/2017.
 */

public class CommonSteps extends BaseStepDef{
    @Autowired
    private SearchPage searchPage;

    private final static org.slf4j.Logger LOG= org.slf4j.LoggerFactory.getLogger("CommonSteps");
    @Given("^I goto the search site$")
    public void i_goto_the_search_site() throws Throwable {
       LOG.info("I go to the search site");
      // webConnect.getDriver().navigate().to("http://www.google.co.uk");

    }

    @When("^I search for \"(.*?)\"$")
    public void i_search_for(String searchText) throws Throwable {
       LOG.info("I search for text :"+searchText);
        searchPage.searchTextbox().sendKeys(searchText);
        searchPage.searchTextbox().sendKeys(Keys.ENTER);
    }

    @Then("^I should find the first link for \"(.*?)\" official site$")
    public void i_should_find_the_first_link_for_cucumber_official_site(String searchText) throws Throwable {
       LOG.info("I should find the first link for cucumber official site");
       WebElement element=  searchPage.searchCucumberLink();
       assertTrue("Cucumber not found..!",searchText.equalsIgnoreCase(element.getText().toLowerCase()));
    }

}
