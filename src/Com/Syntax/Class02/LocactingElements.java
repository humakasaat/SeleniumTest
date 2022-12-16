package Com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocactingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        // enter the username in the TextBox
        driver.findElement(By.id("email")).sendKeys("abracadabra");
        // enter the password in the texbox
        driver.findElement(By.name("pass")).sendKeys(" wowjlmm123");
        // login
       // driver.findElement(By.name("login")).click();
      //  task 2 onforgoton password
     // driver.findElement(By.linkText("Forgot password?")).click();
       // task3
       // driver.findElement(By.partialLinkText("Forgot ")).click();
    }
}
