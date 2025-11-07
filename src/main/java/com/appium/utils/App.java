package com.appium.utils;

public enum App {

    Api_Demos("com.touchboarder.android.api.demos","com.touchboarder.androidapidemos.MainActivity", "API DemosV6.apk"),
    Colculator("","","");


    public final String appPackage;
    public final String appActivity;
    public final String appZipFile;

    App(String appPackage, String appActivity, String appZipFile) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
        this.appZipFile = appZipFile;
    }
}