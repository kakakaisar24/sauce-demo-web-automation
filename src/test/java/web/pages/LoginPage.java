package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginPage {

    private final WebDriver driver;

    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void validateErrorMessage() {
        assertTrue(
                driver.findElement(errorMessage).isDisplayed()
        );
    }
}