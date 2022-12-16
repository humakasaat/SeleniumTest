package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        //anchor tag is must for links
       driver.get("https://www.ebay.com/");
       //
        List<WebElement> ebayLinks= driver.findElements(By.tagName("a"));
        System.out.println("The size of the list is" +ebayLinks.size());
        for(WebElement ebaylink: ebayLinks){
            String link= ebaylink.getAttribute("href");
            System.out.println(link);
        }

    }
}
