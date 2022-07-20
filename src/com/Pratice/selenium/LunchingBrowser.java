package com.Pratice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
     //   WebElement username = driver.findElement(By.id("identifierId"));
       // username.sendKeys("Aimalmansory@gmail.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(3000);
      driver.findElement(By.name("btnK")).click();
    }
}
