package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HomePage {

    private final WebDriver driver;

    private final By productTitle =
            By.xpath("//*[@id=\"item_4_title_link\"]/div");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomepage() {

        assertTrue(
                driver.findElement(productTitle).isDisplayed()
        );

        assertEquals(
                "Sauce Labs Backpack",
                driver.findElement(productTitle).getText()
        );
    }
}