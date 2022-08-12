package com.syntax.Reveiew03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static String url = "https://www.ironspider.ca/forms/checkradio.htm";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // select purple color
        // get all the checkboxes in a list
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));
        // loop through
        for (WebElement checkbox :checkboxes){
        String color = checkbox.getAttribute("value");
            //make a selection if the color is purple
        if (color.equalsIgnoreCase("purple")){
            checkbox.click();
        }

        }

    }
}