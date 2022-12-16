package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        // go to Syntax project
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("isAgeSelected")).click();
    }
}
