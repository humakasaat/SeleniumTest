package Com.Syntax.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {
         // to open up google.com
         // set the path to  the driver to link it with our class
                System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
         //  create a vebDriver instance
                WebDriver driver= new ChromeDriver();
         // use get() function to open up the required website
                driver.get("https://www.google.com/");
         // get the url of the website
                String url= driver.getCurrentUrl();
         // print the url
                System.out.println(url);
         // get the title
            String title  =driver.getTitle();
                System.out.println(title);
         // close the chrome
        // quit()->   it will quit the whole browser
                driver.quit();
         // close() -> it will close the current tab only
                driver.close();



    }
}
