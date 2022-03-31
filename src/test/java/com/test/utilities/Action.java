package com.test.utilities;

import com.test.BaseTest;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Action extends BaseTest {

    public static void waitElement(By by){
        // Wait for element
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));

        // Scroll to view
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript ("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", driver.findElement(by));

    }

    public static void removeHighlight(){


    }

    public static void sendKeys(By by, String input){
        waitElement(by);
        driver.findElement(by).sendKeys(input);
    }

    public static void assertElementDisplayed(By by){
        waitElement(by);
        Assert.assertTrue(driver.findElement(by).isDisplayed());
    }

    public static void click(By by){
        waitElement(by);
        driver.findElement(by).click();
    }

    public static void verifyPageTitle(String title) {
        Assert.assertEquals(title, driver.getTitle());
    }

    public static void pressEnter(By by) {
       driver.findElement(by).sendKeys(Keys.RETURN);
    }

    public static void openURL(String url) {
        driver.get(url);
    }
}
