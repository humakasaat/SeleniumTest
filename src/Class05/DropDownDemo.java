package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.*;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        // go to Syntax project
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

//        find the WebElement dropDwon by looking for select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));

//        use Select class
        Select select =new Select(dropDown);

//        select an option by index
        select.selectByIndex(5);
        Thread. sleep(3000);
//       selectByVisibleText
       select.selectByVisibleText("Saturday");
       Thread.sleep(3000);
//      select by value
        select.selectByValue("Sunday");

//    get all the option avialble in the dropdown
        List<WebElement>  options  =select.getOptions();
        //        traverse through the options
        for(int i=0;i<options.size();i++){

            WebElement option = options.get(i);
            String text = option.getText();
            if(text.equalsIgnoreCase("Friday")){
                select.selectByIndex(i);
            }

        }
    }
}
