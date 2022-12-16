import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        // go to goggle.com
        // go to fb.com
        // go back to google.com
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        // create the webdriver instance
            WebDriver driver= new ChromeDriver();
        // go to google.com
            driver.get("https://www.google.com/");
            driver.navigate().to("https://www.facebook.com/");
        //   introduce some  sleep which is wait
        //  wait or pause for 2000 milli seconds (2)
            Thread.sleep(1000);
        // go back to google
            driver.navigate().back();
        // got to facebook.com
        // wait for two second
            Thread.sleep(2000);
            driver.navigate().forward();
        // refresh the page
        // wait for 2 sec
            Thread.sleep(1000);
            driver.navigate().refresh();




    }
}
