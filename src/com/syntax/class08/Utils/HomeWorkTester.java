package com.syntax.class08.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkTester {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        CommonMethods.openBrowser(driver,"http://www.google.com");
        Thread.sleep(2000);
        CommonMethods.quiteBrowser(driver);
    }
}
