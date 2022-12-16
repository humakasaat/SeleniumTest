package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calander {
    public static void main(String[] args) {
        //   open chrome _browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //  create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//   got to the url
        driver.get("https://www.delta.com/");
 //  click on the calendar
        WebElement calender = driver.findElement(By.xpath("//span[@id='calDepartLabelCont']"));
        calender.click();
 //    get the month and check if it is the desire one

        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        boolean isFound=false;
        while(!isFound){
            String monthName = month.getText();

            if(monthName.equalsIgnoreCase("March")){
//               get all the dates from the table
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
//               traverse through the list to find your desried date
                for(WebElement date:dates){
                    String currentDate = date.getText();
                    if(currentDate.equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }
                }
                System.out.println("i have found the desried month :" +monthName);
                isFound=true;
            }
            else{
                WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nxtBtn.click();
            }


        }



    }
}
////span[@id='calDepartLabelCont']