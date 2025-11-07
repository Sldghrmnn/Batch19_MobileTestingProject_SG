package com.appium.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;

import static com.appium.utils.Driver.*;

public class MobileUtils {
    public static AndroidDriver openApp(Device device,App app){
        runAppiumService();
       return getDriver(device,app);
    }

    public static void closeApp(){
        getDriver().quit();
        stopAppiumService();
    }
    public static void clickWithText(String text){
        getDriver().findElement(By.xpath("//*[@text='"+text+"']")).click();
    }

    public static By getLocatorByText(String text){
        return By.xpath("//*[@text='"+text+"']");
    }

     //ekran kaydirma methodu!!!
    public static void swipeV(double startPoint, double endPoint){
        int width = getDriver().manage().window().getSize().width;
        int height = getDriver().manage().window().getSize().height;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
        Sequence swipe = new Sequence(finger,1);

        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),
                width/2,(int)(height*startPoint)));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); //pressActiion parmagini dokun ve orada tut
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(600),PointerInput.Origin.viewport(),
                width/2,(int)(height*endPoint)));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())); //serbest birakma

        getDriver().perform(Arrays.asList(swipe));
    }

    public static void swipeUntil(By locator, double startPoint, double endPoint){
        while (getDriver().findElements(locator).size() == 0){
            swipeV(startPoint,endPoint);
        }
    }

    public static void swipeAndClick(By locator, double startPoint, double endPoint){
        while (getDriver().findElements(locator).size() == 0){
            swipeV(startPoint,endPoint);
        }
        getDriver().findElement(locator).click();
    }

    public static void clickWithCoordinate(int x, int y){
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(tap));
    }
}



