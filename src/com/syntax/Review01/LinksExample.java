package com.syntax.Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        // to get all the links
       List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links);
        for (WebElement link : links){
           String text = link.getText();
            System.out.println(text);

        }

    }
}
