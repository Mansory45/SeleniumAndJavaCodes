package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
// write your code here
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // for windows add extension.exe
        // you can use\\
        WebDriver driver = new ChromeDriver();// lunch the browser
         driver.get("https://www.google.com/");

    }
}
