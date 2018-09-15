package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;


public class Test1 extends ListTest {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://seleniumpractise.blogspot.com/2017/07/");


//******Google***********************************************************************

        driver.get("http://seleniumpractise.blogspot.com/2017/07/");

        String parent = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[@href = 'http://www.google.com']")).click();

        ArrayList<String> allWindows = new ArrayList<String>(driver.getWindowHandles());

        String child = allWindows.get(1);

        driver.switchTo().window(child);

        driver.findElement(By.xpath("//input[@id = 'lst-ib']")).sendKeys("Valodik");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name = 'btnK']")).click();

        Thread.sleep(3000);

        driver.close();

        driver.switchTo().window(parent);

        Thread.sleep(3000);

//********Facebook***********************************************************************************

        driver.findElement(By.xpath("//a[@href = 'http://www.facebook.com']")).click();

        ArrayList<String> allWindows1 = new ArrayList<String>(driver.getWindowHandles());

        String child1 = allWindows1.get(1);

        driver.switchTo().window(child1);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Vachejan");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value = 'Log In']")).click();

        Thread.sleep(4000);

        driver.close();

        driver.switchTo().window(parent);

//******Yahoo************************************************************************************************


        driver.findElement(By.xpath("//a[@href = 'http://www.yahoo.com']")).click();

        ArrayList<String> allWindows2 = new ArrayList<String>(driver.getWindowHandles());

        String child2 = allWindows2.get(1);

        driver.switchTo().window(child2);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id = 'uh-search-box']")).sendKeys("Valodik");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id = 'uh-search-button']")).click();

        Thread.sleep(4000);

        driver.close();

        driver.switchTo().window(parent);

        driver.quit();

    }


}

