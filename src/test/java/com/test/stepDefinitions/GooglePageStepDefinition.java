package com.test.stepDefinitions;

import com.test.BaseTest;
import com.test.pages.GooglePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDefinition extends BaseTest{

    @Given("launch the browser and navigate to {string}")
    public void launchTheBrowserAndNavigateTo(String url) {
        GooglePage.OpenURL(url);
    }

    @And("search {string}")
    public void search(String search) {
        GooglePage.EnterSearchGoogle(search);
    }

    @Then("verify Top stories section")
    public void verifyTopStoriesSection() {
        GooglePage.VerifyTopStoriesSection();
    }

    @Then("verify Statistic section is displayed")
    public void verifyStatisticSectionIsDisplayed() {
        GooglePage.VerifyStatisticSection();
    }

    @Then("verify MOH website link is available")
    public void verifyMOHWebsiteLinkIsAvailable() {
        GooglePage.VerifyMOHLink();
    }

    @When("click MOH link")
    public void clickMOHLink() {
        GooglePage.ClickMOHLink();
    }

    @Then("verify MOH landing page is displayed")
    public void verifyMOHLandingPageIsDisplayed() {
        GooglePage.VerifyMOHLandingPage();
    }

}
