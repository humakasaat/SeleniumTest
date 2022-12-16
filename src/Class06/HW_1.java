package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW_1 {
    public static void main(String[] args) throws InterruptedException {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        // go to
        driver.get("https://chercher.tech/practice/frames");
        //Maximize the page
        driver.manage().window().maximize();
        //switch to the frame 1
        driver.switchTo().frame("frame1");
        //switch to frame 3
        driver.switchTo().frame("frame3");
        WebElement checkBox= driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();
        // Tak 2 Select baby cat from dropdown
        // switch to main screen
         driver.switchTo().defaultContent();
         // switch to frame 2
         driver.switchTo().frame("frame2");
         //select baby-cat from dropDown
         WebElement dropDown= driver.findElement(By.id("animals"));
         Thread.sleep(300);
         Select select= new Select(dropDown);
         select.selectByValue("babycat");
         driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        // send text to tex-box
        WebElement inputTxt = driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("Done");














    }
}
