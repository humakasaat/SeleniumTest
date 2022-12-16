package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork2 {
    public static void main(String[] args) {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        // go to syntaxprojects.com
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        // maximize
        driver.manage().window().maximize();
        //click on get userName
        WebElement userName = driver.findElement(By.xpath("//button[text()='Get New User']"));
        userName.click();
        //get the firstname  of user and print it on console
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name ')]"));
        String text= firstName.getText();
        System.out.println(text);


    }
}
