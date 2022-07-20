package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement clickonLogin = driver.findElement(By.cssSelector("input#btnLogin"));
        clickonLogin.click();
        WebElement SyntaxLogo = driver.findElement(By.cssSelector("img[alt $= 'HRM']"));
        boolean Isdisplay = SyntaxLogo.isDisplayed();
        if (Isdisplay){
            System.out.println("The Syntax logo is displayed");
        }else {
            System.out.println("The Syntax logo is not displayed");
        }
        Thread.sleep(2000);
        driver.quit();



    }
}
