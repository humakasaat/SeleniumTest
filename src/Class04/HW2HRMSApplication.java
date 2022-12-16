package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2HRMSApplication {

    //Hint:
    //you can use if else condition for verification of message
    //﻿
    public static void main(String[] args) {
    // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
    //  crate instance variable
        WebDriver driver= new ChromeDriver();
    // got to hrm.syntaxtechs
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

    //  Enter valid username
        WebElement username= driver.findElement(By.cssSelector("input[id='txtUsername']"));
        username.sendKeys("Admin");
    // click on login button
        driver.findElement(By.cssSelector(" input[id='btnLogin']")).click();
    // Verify error message with text “Password cannot be empty” is displayed.
         WebElement spanmessage=driver.findElement(By.cssSelector("span[id='spanMessage']"));
         String massage= spanmessage.getText();
         boolean displayStatus= spanmessage.isDisplayed();
         if(displayStatus){
             System.out.println(massage+" "+ "isDisplayed: "+ displayStatus);
         }
         else{
             System.out.println(massage+" "+ "sDisplayed: "+displayStatus );
         }







    }

}
