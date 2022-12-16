package Paractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver= new ChromeDriver();
         driver.get("https://www.google.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
        if(title.equalsIgnoreCase("google")){
            System.out.println("Match");
        } else {
            System.out.println(" not Match");
        }
       // driver.manage().window().fullscreen();
      //  driver.manage().window().maximize();
        driver.navigate().to("https://hum.tv/");
        Thread.sleep(2000);
        driver.navigate().back();


    }
}
