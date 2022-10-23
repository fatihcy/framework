package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShadowLocators {

    @Test
    public void task (){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://letcode.in/shadow");
        driver.findElement(By.xpath("//div[@class='field'][2]")).click();
        Actions acs = new Actions(driver);
        acs.sendKeys(Keys.TAB).perform();
        acs.sendKeys("mojang stdi").perform();

    }

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://letcode.in/shadow");
        WebElement firstNameHost = driver.findElement(By.id("open-shadow"));

        // Old way. And Doesn't work anymore ===================
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        // WebElement fname = (WebElement) js.executeScript("return arguments[0].shadowRoot", firstNameHost);
        // fname.findElement(By.cssSelector("#fname")).sendKeys("Hello");

        // Selenium 3 ===================
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String str = "return document.querySelector(\"#open-shadow\").shadowRoot.querySelector(\"#fname\").value='hello'";
        js.executeScript(str);


        // Selenium 4 ===================
        //SearchContext firstNameShadow = firstNameHost.getShadowRoot();
        //firstNameShadow.findElement(By.cssSelector("#fname")).sendKeys("Hello");

        // Alternative =============================================================

        /*
        <dependency>
        <groupId>io.github.sukgu</groupId>
        <artifactId>automation</artifactId>
        <version>0.0.4</version>
        <dependency>
         */

        //Shadow shadow=new Shadow(driver);
        //WebElement element=shadow.findElement("#fname");
        //element.sendKeys("merhaba");


    }
}
