package hooks;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BaseTest {

    @Before
    public void beforeScenario() {
        setUpDriver();
    }

    @After
    public void afterScenario() {
        tearDownDriver();
    }
}