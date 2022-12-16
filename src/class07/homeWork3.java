package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class homeWork3 {
    public static void main(String[] args) {
        //HomeWork3: (do not use thread .sleep  or Explicit wait)

        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        // go to syntaxprojects.com
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        // maximize
        driver.manage().window().maximize();
        //2.Click on start button
        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();
        //3. get the text Welcome Syntax technologies and print on console
        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text = welcomeText.getText();
        System.out.println("Welcome Syntax technology text: "+text);



    }
}
