package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        // go to accounts.google.com
        driver.get("https://accounts.google.com/signup");
        // maximize
        driver.manage().window().maximize();
        // click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
//        click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
       String gmail=  driver.getWindowHandle();
        Set<String> allHandles= driver.getWindowHandles();
        for(String handle:allHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) {
                System.out.println("The current page is under focus is " + title);
                break;
            }
        }
        //  find the community button and click on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();
        //go to gmail.com page and enter your user_ name in form
        driver.switchTo().window(gmail);

        WebElement firstName=  driver.findElement(By.id("firstName"));
        firstName.sendKeys("Huma");







    }}

