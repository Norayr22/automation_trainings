package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListTest {
    @Test
    public void trel() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.list.am/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[text() = 'Տեղեկանք']")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
