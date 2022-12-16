package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
//Enter valid username and password (username - Admin, password - Hum@nhrm123)
//Click on login button
//Then verify the message "Welcome Admin " is there on the top right corner
//
//

public class HW_1 {
    public static void main(String[] args) {
    // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
    //crate instance variable
        WebDriver driver= new ChromeDriver();
    //got to SYNTAX HRM
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
    // ENTER username
        WebElement username= driver.findElement(By.cssSelector("input[id='txtUsername']"));
        username.sendKeys("Admin");
    //  Enter password
        WebElement password= driver.findElement(By.cssSelector("input[id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
     // Click on login button
        driver.findElement(By.cssSelector(" input[id='btnLogin']")).click();
    //Then verify the message "Welcome Admin " is there on the top right corner
        WebElement message = driver.findElement(By.cssSelector("a[id='welcome']"));
        System.out.println("(Welcome Admin)message is there on top right corner: "+message.isDisplayed());


    }
}
