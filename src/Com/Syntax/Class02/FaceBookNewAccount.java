package Com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookNewAccount {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ahmad");
       // driver.findElement(By.name("firstname")).sendKeys("Ahmad");
        driver.findElement(By.name("lastname")).sendKeys("Zaid");
         //driver.findElement(By.partialLinkText("Mobile number or email")).sendKeys("hKasaat@hotmail.com");
         driver.findElement(By.name("reg_email__")).sendKeys("AhmadZaid@hotmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("iTsnim@1234");
        driver.findElement(By.id("month")).sendKeys("June");
        driver.findElement((By.id("day"))).sendKeys("15");
        driver.findElement(By.id("year")).sendKeys("1998");
       // driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.className("\"_58mt")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.quit();
    }
}
