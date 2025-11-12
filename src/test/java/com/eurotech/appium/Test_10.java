package com.eurotech.appium;


import com.appium.utils.Locators;
import com.eurotech.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.appium.utils.App.*;
import static com.appium.utils.Device.Pixel_3;
import static com.appium.utils.MobileUtils.*;

public class Test_10 extends TestBase implements Locators {

    @Test
    public void test1() {
        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Views");
        waitBy(2);

        List<WebElement> elements = driver.findElements(lListOfViewMenu);

        Set<String> set = new LinkedHashSet<>();

        for (WebElement element : elements) {
        	set.add(element.getText());
        }

        swipeUntil(getLocatorByText("Search View"),.6,.3);
        waitBy(2);

        elements = driver.findElements(lListOfViewMenu);

        for (WebElement element : elements) {
            set.add(element.getText());
        }

        swipeUntil(getLocatorByText("WebView"),.6,.3);
        waitBy(2);

        elements = driver.findElements(lListOfViewMenu);

        for (WebElement element : elements) {
            set.add(element.getText());
        }

        System.out.println("set = " + set);
        System.out.println("set.size() = " + set.size());
    }



}