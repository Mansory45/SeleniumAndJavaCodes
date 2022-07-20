package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement CreateNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        CreateNewAccount.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Aimal");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Mansory");
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("Aimalmansory@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("aimal1234");
        WebElement newPasswoed = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        newPasswoed.sendKeys("aimal1234");
        Thread.sleep(2000);
        WebElement birthmonth = driver.findElement(By.xpath("//select[@id='month']"));
        birthmonth.sendKeys("March");
        WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
        birthDay.sendKeys("19");
        WebElement birthYear = driver.findElement(By.xpath("//select[@id='year']"));
        birthYear.sendKeys("1992");
        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
        Thread.sleep(2000);
        WebElement submmit = driver.findElement(By.xpath("//button[@name='websubmit']"));
        submmit.click();

        driver.quit();
    }
}
