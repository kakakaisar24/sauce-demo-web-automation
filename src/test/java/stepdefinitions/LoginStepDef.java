package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef extends BaseTest {

    private LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {

        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
    }

    @When("user input username with {string}")
    public void userInputUsernameWith(String username) {

        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {

        loginPage.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {

        loginPage.clickLoginButton();
    }

    @Then("user see error message")
    public void userSeeErrorMessage() {

        loginPage.validateErrorMessage();
    }
}