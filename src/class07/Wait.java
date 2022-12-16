package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//until the element is found
        // go to syntaxprojects.com
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        // click on the statr button
        WebElement start=driver.findElement(By.id("startButton"));
        start.click();
        WebElement welcomeTxt= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text= welcomeTxt.getText();
        System.out.println("The text is" +text);
    }
}
