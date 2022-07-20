package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Aimal");
        driver.findElement(By.id("customer.lastName")).sendKeys("Mansory");
        driver.findElement(By.id("customer.address.street")).sendKeys("4750 Auburn Way Norht");
        driver.findElement(By.id("customer.address.city")).sendKeys("Auburn");
        driver.findElement(By.id("customer.address.state")).sendKeys("Washington state");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("98002");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2027551014");
        driver.findElement(By.id("customer.ssn")).sendKeys("055456398");
        driver.findElement(By.id("customer.username")).sendKeys("AimaMansory");
        driver.findElement(By.id("customer.password")).sendKeys("khadija212");
        driver.findElement(By.id("repeatedPassword")).sendKeys("khadija212");
        driver.findElement(By.className("button")).click();
        driver.quit();
    }
}
