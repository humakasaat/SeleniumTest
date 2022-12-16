package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        // go to f.com
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("// input[@id='email']")).sendKeys("huma");
        //click on forgot password
       //  driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
        driver.findElement(By.xpath("//input[starts-with(@name,'Pas')]")).click();

    }
}
