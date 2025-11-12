package com.appium.utils;

import org.openqa.selenium.By;

import static com.appium.utils.MobileUtils.getLocatorByText;

public interface Locators {

    By lWebView = getLocatorByText("WebView");

    By lTabs= getLocatorByText("Tabs");

    By lTabsElements = By.className("android.widget.TextView");

    By lResult = By.id("result_final");

    By lListOfViewMenu= By.id("android:id/text1");
}
