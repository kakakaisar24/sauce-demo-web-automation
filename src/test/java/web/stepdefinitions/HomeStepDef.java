package web.stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.Then;
import web.pages.HomePage;

public class HomeStepDef extends BaseTest {

    private HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomepage();
    }
}