package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("");
        WebElement clickonLogin = driver.findElement(By.cssSelector("input#btnLogin"));
        clickonLogin.click();
        WebElement CanNotBeEmpty = driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        if (CanNotBeEmpty.isDisplayed()){
            System.out.println("Password cannot be Empty is Displayed");
        }else {
            System.out.println("Password cannot be Empty is not displayed");
        }
    }
}
