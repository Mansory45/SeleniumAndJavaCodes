package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW2
    Go to ebay.com
    get all the categories and print them in the console
    select Computers/Tables & Networking
    click on search
    verify the header
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        WebElement allCategories = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select = new Select(allCategories);

        List<WebElement> option = select.getOptions();
        for (WebElement options: option){
            String optionsText = options.getText();
            System.out.println(optionsText);
        }

        select.selectByVisibleText("Computers/Tables & Networking");
        WebElement search = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
        search.click();
        Thread.sleep(1000);
        WebElement header = driver.findElement(By.cssSelector("span.b-pageheader__text"));
        String headerText = header.getText();
        Thread.sleep(1000);
        if (header.isDisplayed()){
            System.out.println("Header is displayed");
        }


    }
}
