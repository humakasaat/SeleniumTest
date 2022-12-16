package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass {
    public static void main(String[] args) {
        //   open chrome _browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //  create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//   got to the url
        driver.get("https://www.amazon.com/");
//    find element EN
        WebElement enHover = driver.findElement(By.xpath("//div[text()='EN']"));
//    action class
        Actions actions= new Actions(driver);
        actions.moveToElement(enHover).perform();
    }
}
