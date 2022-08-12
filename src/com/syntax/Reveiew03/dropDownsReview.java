package com.syntax.Reveiew03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDownsReview {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //click on Create new accoutn on the page
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
        WebElement dayDD = driver.findElement(By.xpath("//select[@id='day']"));
        //select class to deal with drop down
        Select select = new Select(dayDD);
        List<WebElement> availableDays = select.getOptions();
        int size = availableDays.size();

       // for (WebElement day: availableDays){
       //     System.out.println(day.getText());
     //   }
        //Select all option one by one a difference of two seconds


  //          for (int i = 0; i <size;i++){
    //            System.out.println( availableDays.get(i).getText());
    //            select.selectByIndex(i);
     //           Thread.sleep(2000);

        // Select by index the date 3

        select.selectByIndex(2);

          //  select by value the date 22
     //  select.selectByValue("26");

        // select the option 7 by visiable text
        select.selectByVisibleText("7");
        Thread.sleep(200);
    }

}