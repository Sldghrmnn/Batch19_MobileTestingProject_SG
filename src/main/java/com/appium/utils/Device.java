package com.appium.utils;

public enum Device {
    Pixel_3("emulator-5554","11","Pixel_3","Android","uiautomator2"),
    Samsung_S23("FHHH5855","14","Samsung S23F","Android","uiAutomator2");

    public final String udid;
    public final String version;
    public final String deviceName;
    public final String platformName;
    public final String automationName;

    Device(String udid, String version, String deviceName, String platformName, String automationName) {
        this.udid = udid;
        this.version = version;
        this.deviceName = deviceName;
        this.platformName = platformName;
        this.automationName = automationName;
    }
}
