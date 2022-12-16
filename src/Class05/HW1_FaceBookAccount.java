package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1_FaceBookAccount {
    public static void main(String[] args) throws InterruptedException {
//  open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
//  crate instance variable
        WebDriver driver= new ChromeDriver();
 // go to facebook.com
        driver.get("https://www.facebook.com/");
 //  maximize the window
        driver.manage().window().maximize();
 // click on create New Account
        WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAcc.click();
        Thread.sleep(2000);
//      fill the form
        driver.findElement(By.name("firstname")).sendKeys("Ali");

        driver.findElement(By.name("lastname")).sendKeys("Ahmad");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("123456789");

        driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("Abracadabra");

        Thread.sleep(2000);

         WebElement month= driver.findElement(By.id("month"));

        Select slelect1= new Select(month);

        slelect1.selectByValue("1");

         WebElement day=driver.findElement(By.id("day"));

         Select select2= new Select(day);

         select2.selectByValue("2");

         Thread.sleep(2000);
          WebElement year=driver.findElement(By.id("year"));

          Select select3= new Select(year);
          select3.selectByValue("1996");

          Thread.sleep(2000);
         WebElement checkMale=  driver.findElement(By.xpath("//label[text()='Male']"));
         checkMale.click();








    }
}
