package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropDown {

    public  static String url="https://www.amazon.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement catagoresDD=driver.findElement(By.id("searchDropdownBox"));

        Select select= new Select(catagoresDD);
        List<WebElement> Option= select.getOptions();

        for(WebElement option:Option){
            String optionText= option.getText();
            System.out.println(optionText);
        }
        select.selectByValue("search-alias-appliance");
    }

}