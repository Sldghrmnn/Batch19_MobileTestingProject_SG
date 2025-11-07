package com.eurotech.appium;


import com.appium.utils.Locators;
import com.eurotech.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static com.appium.utils.MobileUtils.*;

public class Test_7 extends TestBase implements Locators {

    @Test
    public void test1() {
        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");
        driver.navigate().back();
        clickWithText("Views");

        swipeV(.9,.2);
        swipeV(.9,.2);
        swipeV(.2,.9);

    }

    @Test
    public void test2() {
        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");
        driver.navigate().back();
        clickWithText("Views");

        swipeUntil(lWebView, .8, .2);

    }

    @Test
    public void test3() {
        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");
        driver.navigate().back();
        clickWithText("Views");

        swipeAndClick(lWebView,.6,.3);

    }

    @Test
    public void test4() {
        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");
        driver.navigate().back();
        clickWithText("Views");

       clickWithCoordinate(172,971);

    }
}