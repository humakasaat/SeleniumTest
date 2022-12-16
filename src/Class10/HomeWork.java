package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    //Go to syntax hrms .
    //Go-to the recruitment tab.
    //From the calendar  just select a date
    //8 August 2023
    public static void main(String[] args) {
        //   open chrome _browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //  create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         //   got to the url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //Go-to the recruitment tab.
        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentBtn.click();
        //From the calendar  just select a date
        WebElement calender = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calender.click();
        // select month August
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select= new Select(month);
        select.selectByVisibleText("Aug");
        //select year 2023
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        year.click();
        Select select1= new Select(year);
        select1.selectByValue("2023");
        // select date 8
        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for ( WebElement day:days){
          if(day.getText().equalsIgnoreCase("8")) ;
          day.click();
        }
     //  driver.quit();

    }
}


////table[@class='ui-datepicker-calendar']/tbody/tr/td