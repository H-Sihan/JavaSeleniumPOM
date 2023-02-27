package com.lambdatest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }
    //Method for find Element
    protected WebElement find(By locator){
        return driver.findElement(locator);
    }
    //Method for Click
    protected void click(By locator){
        find(locator).click();
    }
    //Method for get text verification
    protected String getText(By locator){
        String text = find(locator).getText();
        System.out.println("Text: " + text);
        return text;
    }
}
