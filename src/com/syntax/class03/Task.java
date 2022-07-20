package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigate to http://syntaxprojects.com
        Click on start practicing
        click on simple form demo
        enter any text on first text box
        click on show message
          quit the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        WebElement startPracticeingButton = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticeingButton.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleFormDemo.click();
        Thread.sleep(2000);
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder ^= 'Please enter']"));
        textBox.sendKeys("Please show me the Message");
        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick *= 'show']"));
        showMessageButton.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
