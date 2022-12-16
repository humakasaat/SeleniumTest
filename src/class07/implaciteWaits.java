package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implaciteWaits {
    public static void main(String[] args) {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // go to gamail signup page
        driver.get("https://www.facebook.com/");
        //     maximize
        driver.manage().window().maximize();
        // click on create new account
       WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
       createNewAccount.click();
       //send the first name
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("abracadabra");

    }
}
