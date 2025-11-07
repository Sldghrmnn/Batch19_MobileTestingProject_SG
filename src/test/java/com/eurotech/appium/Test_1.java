package com.eurotech.appium;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test_1 {

 //selenium: webdriver --- driver---url --- webpage
 //appium: appiumdriver ---driver---cihaz---app
    /**
     * {
     *   "appium:udid": "emulator-5554",
     *   "appium:platformVersion": "11",
     *   "appium:deviceName": "Pixel_3",
     *   "platformName": "Android",
     *   "appium:realDevice": false,
     *   "appium:automationName": "uiautomator2",
     *   "appium:disableIdLocatorAutocompletion": true
     * }
     */
    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        //device--cihaz tanimlamasi
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("appium:platformVersion", "11");
        capabilities.setCapability("appium:deviceName", "Pixel_3");
        capabilities.setCapability("platformName", Platform.ANDROID);
        capabilities.setCapability("appium:automationName", "uiautomator2");

        //app -- aplikasyonu (uygulama) tanimlayalim
        //app package --- app activity

        //com.touchboarder.android.api.demos/com.touchboarder.androidapidemos.MainActivity

        capabilities.setCapability("appium:appPackage", "com.touchboarder.android.api.demos");
        capabilities.setCapability("appium:appActivity", "com.touchboarder.androidapidemos.MainActivity");

        AndroidDriver driver;
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);

        driver.findElement(By.xpath("//*[@text='Continue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='API Demos']")).click();
        driver.findElement(By.xpath("//*[@text='Accessibility']")).click();
        Thread.sleep(2000);
        driver.rotate(ScreenOrientation.LANDSCAPE);
        Thread.sleep(2000);
        //driver.rotate(ScreenOrientation.PORTRAIT);
        Thread.sleep(2000);

        driver.quit();

    }
}
