package Class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
//goto https://demo.guru99.com/test/simple_context_menu.html
//right click  on the button, select edit and handle the alert
//double click on the button and handle the alert
public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
 //      create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 //      got to the url
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
 //     right_ click  on the button
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action= new Actions(driver);
        action.contextClick(rightClickBtn).perform();
 //     select edit and handle the alert
        WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
        edit.click();
        Alert alert= driver.switchTo().alert();
        alert.accept();
//       double_ click on the button
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[ contains(text(),'Double')]"));
        Actions actions= new Actions(driver);
        action.doubleClick(doubleClickBtn).perform();
 //    handle the alert
        Alert alert1= driver.switchTo().alert();
        alert1.accept();


    }
}
