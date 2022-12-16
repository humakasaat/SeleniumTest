package Com.Syntax.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        // go to google .com maximize the window
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        // create instance of webDriver
            WebDriver driver= new ChromeDriver();
        // go to google.com
            driver.get("https://www.google.com/");
        // maximize
        //    driver.manage().window().maximize();
        // fullScreen
            driver.manage().window().fullscreen();
        // quite
            driver.quit();


    }

}
