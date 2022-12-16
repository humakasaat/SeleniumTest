package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW_hrm {
    public static void main(String[] args) {
        //   open chrome _browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //  create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//   got to the url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//   user_ name
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
//   password
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
//   click on login Button
        WebElement loginBtn = driver.findElement(By.name("Submit"));
        loginBtn.click();
//   click on PIM
        WebElement PIM= driver.findElement(By.xpath("//b[text()='PIM']"));
        PIM.click();
//   click on Employee List
       WebElement employeeList= driver.findElement(By.xpath("//a[text()='Employee List']"));
       employeeList.click();
 //  from the table choose one id (it must be from the first page)
 //   step 1 check the check-box that contains id"45018A"
        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
 //    step2 traverse through the loop
        for (int i = 0; i <secondColumn.size() ; i++) {
 //           System.out.println(secondColumn.get(i).getText());
            String text = secondColumn.get(i).getText();
            if (text.equalsIgnoreCase("45018A")) {
                System.out.println("The index of the row is "+(i+1));

 //  and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();
            }
            }


        }

    }



