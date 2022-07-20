package com.syntax.Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        //access the WebElement radioBtn "Option"
        WebElement option3 = driver.findElement(By.xpath("//input[@value='Option 3']"));
        //Checj uf the raio button is selected
       boolean state = option3.isSelected();
        System.out.println("The state of the raido button is :" + state);
        // checj uf the radio button is dispaled
        boolean displayed = option3.isDisplayed();
        System.out.println("Is the radio button displayed: "+ displayed);
        // Check if the radio button is enabled
        boolean enabled = option3.isEnabled();
        System.out.println("is the radio button is enabled :" + enabled);
        // Select the radio button
        option3.click();
        //check if it is selected
         state = option3.isDisplayed();
        System.out.println("The sate of the radio button is :" + state);
    }
}