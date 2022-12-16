package ReviewClass_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
//  Open the Syntax
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
//    Find the ridio Button
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
//      traverse through the list of webelement
        for(WebElement radioBtn:radioBtns) {
            String option= radioBtn.getAttribute("value");
            if( option.equalsIgnoreCase("5 - 15")){
                radioBtn.click();
            }
        }
    }
}
