package com.syntax.Reviewc04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandles {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        // got ot Gmail.com
        // open up privacy help term tabs
        // go to privacy tab and  get the title print on the screen
        //        find all the buttons that open up new windows or tabs
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));


//        clicking on the btns
        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();

        // get the main page handle and print on the screen
        String mainPageHanle = driver.getWindowHandle();
        System.out.println("The  main page handleno is :"+ mainPageHanle);

        // Major Task --> Get the title from privacy Tab
        // 1. get all the windows handles
       Set<String> allHandles= driver.getWindowHandles();
       //2.itreate create an iterator
        Iterator<String>it = allHandles.iterator();
        // 3.the while loop

        while (it.hasNext()){
            // 4. getting the first handle form the set
            String windowHanlde = it.next();
            //5. switch to this particular and handle to make sure it is the right one
            driver.switchTo().window(windowHanlde);
            //6. make sure that this window is the privacy one
            String title = driver.getTitle();
            //7. make sure the title is that of the privacy page
           if (title.contains("Google Terms of Service � Privacy & Terms � Google")){
               System.out.println(title);
               break;
           }







        }

    }
}
