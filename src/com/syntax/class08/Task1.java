package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
    click on checkbox and click on remove
    verify the text
    click on enable verify the textbox is enabled
    enter text and click disable
    verify the textbox is disabled
     */
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        Thread.sleep(2000);
        WebElement removeCheckBox = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeCheckBox.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement displayedText=driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println("The text is displayed:" +displayedText.isDisplayed());
        String headerText=displayedText.getText();
        System.out.println(headerText);
        String correctText="It's gone!";
        if (headerText.equals(correctText)){
            System.out.println("The text is correct");
        }else{
            System.out.println("Text is not correct");
        }
        WebElement enablebutton= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enablebutton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        WebElement textBox= driver.findElement(By.xpath("//input[@type='text']"));

        System.out.println("The TexBox is enabled:"+textBox.isEnabled());
        textBox.sendKeys("Hi Aimal");

        Thread.sleep(2000);
        textBox.clear();

        WebElement text1=driver.findElement(By.xpath("//p[contains(text(),'enabled!')]"));
        String headertext1=text1.getText();
        System.out.println(headertext1);
        WebElement disableButton=driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
        disableButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement text2= driver.findElement(By.xpath("//p[@id='message']"));
        String headertext2=text2.getText();
        System.out.println(headertext2);
        System.out.println("The text box is disabled: "+textBox.isDisplayed());
    }
}