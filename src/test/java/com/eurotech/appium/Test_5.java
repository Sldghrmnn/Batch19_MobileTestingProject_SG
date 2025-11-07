package com.eurotech.appium;


import com.appium.utils.App;
import com.appium.utils.Device;
import com.appium.utils.Driver;
import com.appium.utils.MobileUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

import static com.appium.utils.MobileUtils.*;

public class Test_5 {

    AndroidDriver driver;
    WebDriverWait wait;

    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        driver = openApp(Device.Pixel_3, App.Api_Demos);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        closeApp();
    }


}