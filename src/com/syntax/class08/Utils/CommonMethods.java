package com.syntax.class08.Utils;

import org.openqa.selenium.WebDriver;

public class CommonMethods {
    // create a package and name it as utils
    // create a class and name as CommonMethods
    // create functions (methods) to open and quit the browsers
    //open method has to accept a url as a parameter

    public static void openBrowser (WebDriver driver,String url){
        driver.get(url);
    }
    public static void quiteBrowser(WebDriver driver){
        driver.quit();
    }
}
