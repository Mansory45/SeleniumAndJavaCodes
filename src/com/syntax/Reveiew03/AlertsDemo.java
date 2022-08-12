package com.syntax.Reveiew03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get(url);
        // click on alret
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();

        // Handle the alert

       Alert alertX = driver.switchTo().alert();
       Thread.sleep(2000);
       alertX.accept();
       

    }
}
