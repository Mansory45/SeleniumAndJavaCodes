package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");


        WebDriver driver = new FirefoxDriver();// launch the browser
        driver.get("http://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title  = driver.getTitle();
        System.out.println(title);
        driver.quit();




    }
}
