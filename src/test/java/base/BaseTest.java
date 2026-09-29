package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected static WebDriver driver;

    protected void setUpDriver() {
        driver = WebDriverManager
                .chromedriver()
                .create();
    }

    protected void tearDownDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}