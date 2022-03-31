package com.test.stepDefinitions;

import com.test.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BaseTest {

    @Before
    public void openBrowser(){
        browserSetup();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario){

        final byte [] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        scenario.attach(screenshot, "image/png","");
    }

    @After
    public void closeBrowser(){
        close();
        quit();
    }
}
