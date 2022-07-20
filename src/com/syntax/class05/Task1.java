package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        TC 1: Facebook dropdown verification
        Open chrome browser
        Go to "https://www.facebook.com"
        click on create new account
        Verify:
        month dd has 12 month options
        day dd has 31 day options
        year dd has 115 year options
        Select your date of birth
        Quit browser
         */

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement singUpButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
        singUpButton.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Aimal");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Mansory");
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("Aimalmansory@gmail.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("aimal1234");
        WebElement newPasswoed = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        newPasswoed.sendKeys("aimal1234");
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select select = new Select(month);
        List<WebElement>monthOptions = select.getOptions();
        int monthSize = monthOptions.size();
        System.out.println(monthSize);
        select.selectByIndex(5);
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        select = new Select(day);
        List<WebElement>dayOptions = select.getOptions();
        int daySize = dayOptions.size();
        System.out.println(daySize);
        select.selectByIndex(9);
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        select = new Select(year);
        List<WebElement>yearOptions = select.getOptions();
        int yearSize = yearOptions.size();
        System.out.println(yearSize);
        select.selectByVisibleText("2015");
        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
         WebElement submmit = driver.findElement(By.xpath("//button[@name='websubmit']"));
          submmit.click();
        driver.quit();

    }
}
