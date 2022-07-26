package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommandDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // this code give us code reuseablity
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username  =  driver.findElement(By.id("ctl00_MainContent_username"));// getting webelement in return
        username.sendKeys("Tester");// performing action on the specific element
        WebElement password =  driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        Thread.sleep(2000);
        username.clear();
        password.clear();
        driver.quit();

    }
}
