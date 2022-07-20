package com.syntax.Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://demo.guru99.com/insurance/v1/register.php");
       // access the text box surname usign absolute xpath
       WebElement surname = driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
       surname.sendKeys("mansory");
       WebElement firstName = driver.findElement(By.xpath("//input[@id='user_firstname']"));
       firstName.sendKeys("aimal");
       // access the webelement date of birth and pritn the text on cosole
       WebElement dateOfBirth = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
        System.out.println(dateOfBirth.getText());
        // access the webelement lisence period and print on the console
        WebElement lisence = driver.findElement(By.xpath("//label[contains(text(),\"Period\")]"));
        System.out.println(lisence.getText());
        //access the weblement
        WebElement radioBtn = driver.findElement(By.xpath("//label[text()='Full']/following-sibling::input"));
        radioBtn.click();
        // access the the texbox phone number and send it the number
        WebElement phoneNum = driver.findElement(By.cssSelector("input#user_phone"));
        phoneNum.sendKeys("207391017");
        //   acces the webelement address and send in the address
        WebElement address = driver.findElement(By.cssSelector("input[id*='attributes_street']"));
        address.sendKeys("Afghanistan");

    }
}
