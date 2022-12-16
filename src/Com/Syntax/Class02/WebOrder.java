package Com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
            WebDriver driver= new ChromeDriver();
            // got to smart bear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //  maximaziem the window
        driver.manage().window().maximize();
        // Enter user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
         String title=driver.getTitle();
         if (title.equalsIgnoreCase("Web Orders")){
             System.out.println(" The title is correct");

        }
         else{
             System.out.println(" the title is not correct");
         }

    }
}
