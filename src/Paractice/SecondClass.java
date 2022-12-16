package Paractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        String path="https://www.syntaxtechs.com/enroll/apply";
        driver.get(path);
        driver.findElement(By.tagName("input"));
       // driver.findElement(By.id())

    }
}
