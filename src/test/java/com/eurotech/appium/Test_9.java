package com.eurotech.appium;


import com.appium.utils.Locators;
import com.eurotech.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.appium.utils.App.*;
import static com.appium.utils.Device.Pixel_3;
import static com.appium.utils.MobileUtils.*;

public class Test_9 extends TestBase implements Locators {

    @Test
    public void test4() {
        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");

        driver = openApp(Pixel_3,Chrome);
        waitBy(3);

        clickWithText("Accept & continue");

        waitBy(2);

        clickWithText("No thanks");

        driver.get("https://sdettest.eurotechstudy.eu/login");
      //  driver.findElement(By.xpath("//*[@resource-id='email']")).sendKeys("aaaaaaa");

        driver= openApp(Pixel_3, Colculator);

        clickToNumbers(3);
        clickToNumbers(6);
        clickToOperators("divide");
        clickToNumbers(4);
        clickToOperators("equals");

        String actualResult = getCalculatorResult();
        String expectedResult = "9";
        Assert.assertEquals(actualResult,expectedResult);

        activateBackgroundApp(Api_Demos.appPackage);

        clickWithText("Text");
    }


}