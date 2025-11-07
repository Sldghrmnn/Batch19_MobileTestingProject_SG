package com.appium.utils;

import org.openqa.selenium.By;

import static com.appium.utils.MobileUtils.getLocatorByText;

public interface Locators {

    By lWebView = getLocatorByText("WebView");
}
