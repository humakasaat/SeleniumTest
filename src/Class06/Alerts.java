package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        // go to Syntax project
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //     maximize
        driver.manage().window().maximize();
        //find the button click
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(3000);
        //Handling the alert
        Alert simpleAlert1=   driver.switchTo().alert();
        simpleAlert1.accept();

       WebElement conformationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
       conformationAlert.click();
        Alert conformationAlert1 = driver.switchTo().alert();
        conformationAlert1.dismiss();
        WebElement propmpAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        propmpAlert.click();
        Alert promp1 = driver.switchTo().alert();
        promp1.sendKeys("abragrjfs");
        promp1.accept();


    }
}
