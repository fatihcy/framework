package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TransferMateCaptcha {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://transfermate.io/en/register.asp?");

        WebElement captcha = driver.findElement(By.id("cal_captcha_f10_question"));

        System.out.println("captcha.getAttribute(\"innerText\") = " + captcha.getAttribute("innerText"));

        String s = captcha.getAttribute("innerText");
        //String s = "3 + 5 =";
        String[] res = s.split(" ");
        int result;
        if(res[1] == "+") {
            result = Integer.valueOf(res[0]) + Integer.valueOf(res[2]);
            System.out.println("result = " + result);
        } else {
            result = Integer.valueOf(res[0]) + Integer.valueOf(res[2]);
            System.out.println("result = " + result);
        }

        //(Integer.valueOf("3") + Integer.valueOf("5"))
    }
}
