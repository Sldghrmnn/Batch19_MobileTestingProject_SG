package com.eurotech.appium;


import com.appium.utils.App;
import com.appium.utils.Device;
import com.eurotech.TestBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

import static com.appium.utils.MobileUtils.*;

public class Test_6 extends TestBase {

    @Test
    public void test1() {
        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");
    }


}