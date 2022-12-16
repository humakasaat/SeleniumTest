package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Navigate to http://syntaxprojects.com/
//Click on start practicing
//click on simple form demo
//enter any text on first text box
//click on show message
//quit the browser
public class XpathHomeWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(@id,'btn_basic')]")).click();
       // driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item'][(text()='Simple Form Demo')]")).click();
        driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("Hello my name is Huma");
        driver.findElement(By.xpath("//button[starts-with(text(),'Show')]")).click();
        driver.quit();



    }
}
