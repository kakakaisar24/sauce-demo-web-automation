//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//
//public class HomePage {
//
//    private final WebDriver driver;
//
//    private final By productTitle =
//            By.xpath("//*[@id=\"item_4_title_link\"]/div");
//
//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void validateOnHomepage() {
//
//        assertTrue(
//                driver.findElement(productTitle).isDisplayed()
//        );
//
//        assertEquals(
//                "Sauce Labs Backpack",
//                driver.findElement(productTitle).getText()
//        );
//    }
//}




package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import web.pages.HomePage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HomePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By productTitle =
            By.xpath("//*[@id='item_4_title_link']/div");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void validateOnHomepage() {

        WebElement productElement =
                wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle));

        assertTrue(productElement.isDisplayed());

        assertEquals(
                "Sauce Labs Backpack",
                productElement.getText()
        );
    }
}