package org.tts.selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BatchTest2 {

    @Test
    void logoTest() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D:\\chromedirever\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();

}
}