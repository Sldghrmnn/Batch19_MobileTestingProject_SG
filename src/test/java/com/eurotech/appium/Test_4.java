package com.eurotech.appium;


import com.appium.utils.App;
import com.appium.utils.Device;
import com.appium.utils.Driver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_4 {

    AndroidDriver driver;
    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        Driver.runAppiumService();
        driver = Driver.getDriver(Device.Pixel_3,App.Api_Demos);


        clickWithText("Continue");
        Thread.sleep(2000);
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        driver.quit();
        Driver.stopAppiumService();
    }

    private void clickWithText(String text){
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }
}
