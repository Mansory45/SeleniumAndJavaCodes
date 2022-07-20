package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("http://facebook.com");
       driver.navigate().to("http://www.google.com");
       driver.navigate().back();
       driver.navigate().forward();
       Thread.sleep(5000); // paused the execution for 2 second
       driver.navigate().refresh(); // will refresh the browser
       driver.close(); //Driver.close() will close the current  tab
       driver.quit(); // will close the whole browser

    }
}
