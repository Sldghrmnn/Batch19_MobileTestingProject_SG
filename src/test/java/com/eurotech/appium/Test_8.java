package com.eurotech.appium;


import com.appium.utils.App;
import com.appium.utils.Device;
import com.appium.utils.Locators;
import com.eurotech.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.appium.utils.App.Api_Demos;
import static com.appium.utils.App.Colculator;
import static com.appium.utils.Device.Pixel_3;
import static com.appium.utils.MobileUtils.*;

public class Test_8 extends TestBase implements Locators {

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

        swipeAndClick(lTabs,.6,.3);

        //Tabs sekmesindeki web elementleri bir list e alalim ve yazdiralim
        List<WebElement> tabElements = driver.findElements(lTabsElements);

        for (WebElement element : tabElements) {
            System.out.println(element.getText());

        }
        System.out.println("tabElements.size() = " + tabElements.size());

        driver= openApp(Pixel_3, Colculator);

        clickToNumbers(3);
        clickToNumbers(6);
        clickToOperators("divide");
        clickToNumbers(4);
        clickToOperators("equals");

        String actualResult = getCalculatorResult();
        String expectedResult = "9";

        Assert.assertEquals(actualResult,expectedResult);

        //alttaki kod uygun deegildir, cunku uygulamayi sifiran acar.
        //bu durumda kaldigimiz yere donemeyiz
       // driver= openApp(Pixel_3, Api_Demos);

        activateBackgroundApp(Api_Demos.appPackage);



    }


}