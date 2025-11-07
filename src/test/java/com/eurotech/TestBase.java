package com.eurotech;

import com.appium.utils.App;
import com.appium.utils.Device;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static com.appium.utils.MobileUtils.*;


public class TestBase {

    protected AndroidDriver driver;
    protected WebDriverWait wait;

    @BeforeTest
    public void beforeTest(){
        driver = openApp(Device.Pixel_3, App.Api_Demos);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterTest
    public void afterTest(){
        closeApp();
    }
}
