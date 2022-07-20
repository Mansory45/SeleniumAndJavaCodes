package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Aimal");
        driver.findElement(By.name("lastname")).sendKeys("Aimal");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email__")).sendKeys("mansory@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("adfj23");
        driver.findElement(By.name("birthday_month")).sendKeys("December");
        driver.findElement(By.name("birthday_day")).sendKeys("15");
        driver.findElement(By.name("birthday_year")).sendKeys("1992");
        Thread.sleep(3000);
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("sex")).sendKeys("Male");
        driver.findElement(By.name("websubmit")).click();

       // driver.close();




    }
}
