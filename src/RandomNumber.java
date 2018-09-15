import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://account-stg.sylkar.net/registration");

        Random rand = new Random();
        int i = 100000 +  rand.nextInt(899999);

        System.out.println(i);
        String email = "Test" + i + "@mailinator.com";

        System.out.println(email);

        String FirstName = "Vache";

        String LastName = "Hambardzumyan";

        driver.findElement(By.xpath("//input[@placeholder = 'First Name']")).sendKeys(FirstName);

        driver.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys(LastName);

        driver.findElement(By.xpath("//input[@placeholder = 'Email address']")).sendKeys(email);

        driver.findElement(By.xpath("//input[@class = 'form-control ng-pristine ng-valid ng-touched']")).sendKeys("123456");







    }



}


