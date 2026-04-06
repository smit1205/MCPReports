package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utils.DriverFactory;
import utils.ExtentManager;
import com.aventstack.extentreports.*;


public class Hooks {

    static ExtentReports extent = ExtentManager.getInstance();
    static ExtentTest test;

    @Before
    public void setup(io.cucumber.java.Scenario scenario) {
        test = extent.createTest(scenario.getName());
        DriverFactory.initDriver();
    }

    @After
    public void tearDown(io.cucumber.java.Scenario scenario) {

        if (scenario.isFailed()) {
            test.fail("Test Failed");
        } else {
            test.pass("Test Passed");
        }

        DriverFactory.quitDriver();
        extent.flush();
    }
}