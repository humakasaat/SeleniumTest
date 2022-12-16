package Class12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecuterScroll {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            //      create a WebDriver instance
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
  //       goto amazon.com
            driver.get("https://www.amazon.com");
//        scroll down
                    JavascriptExecutor js= (JavascriptExecutor) driver;//object of javascript
            js.executeScript("window.scrollBy(0,500)");
 //       scroll up
            js.executeScript("window.scrollBy(0,-500)");

    }
}
