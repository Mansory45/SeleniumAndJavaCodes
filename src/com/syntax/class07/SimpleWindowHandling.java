package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    // Windows handling
    public static String url ="http://accounts.google.com/signup";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle =  driver.getWindowHandle(); // get window handle for the main page
        System.out.println(mainPageHandle);
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();
       Set<String> allWindowhandles = driver.getWindowHandles();// store all the handles inside the set
        System.out.println(allWindowhandles.size());


        Iterator<String>  it = allWindowhandles.iterator();// have an iterator in order ot iterate through the handles
        mainPageHandle = it.next();// take first step and assign the main page handle
        String childHandle = it.next(); // Take the second step and have a child handle
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(childHandle);
        driver.close();
        driver.switchTo().window(mainPageHandle);
        helpLink.click();
        driver.quit();


    }
}
