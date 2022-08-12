package com.syntax.Reveiew03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

    public static String url = "https://demoqa.com/select-menu";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get(url);
        // To check if the dropdown is multi select or not
       WebElement mulDD =  driver.findElement(By.xpath("//select[@id='cars']"));
        Select select = new Select(mulDD);
        boolean isMultiSelect = select.isMultiple();
        System.out.println("The dropdown is multiSelect :" + isMultiSelect );

        select.selectByIndex(0);

        select.selectByVisibleText("Opel");

        select.selectByValue("saab");
        Thread.sleep(2000);
        //Deseclect
        select.deselectByVisibleText("Opel");
        Thread.sleep(2000);
        select.deselectAll();
    }
}