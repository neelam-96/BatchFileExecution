package org.tts.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BatchTest1 {
    WebDriver driver;


    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedirever\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Lunch Chrome

        driver.get("https://www.facebook.com/");//enter URL
        //  driver.manage().window().maximize();//Maximize Window



        WebElement logo = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i"));

        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(2000);
    }


}
