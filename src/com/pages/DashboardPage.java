package com.pages;

import com.utils.CommonMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethod {
    @FindBy(id = "welcome")
    public WebElement welcomeAdmin;

    @FindBy(xpath = "//a[text() = 'Logout']")
    public WebElement logout;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}