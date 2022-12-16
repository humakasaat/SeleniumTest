package Class05;
//1.Go to ebay.com
//2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
//3.select Computers/Tables & Networking
//4.click on search
//5.verify the title
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2_ebayCom {
    public static void main(String[] args) {
        //  open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
//  crate instance variable
        WebDriver driver= new ChromeDriver();
//    go to ebay.com
       driver.get("https://www.ebay.com/");

//select dropdown
        WebElement AllCategories = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select= new Select(AllCategories);
        List<WebElement> options= select.getOptions();
        for( int i=0; i<options.size(); i++){
            WebElement option= options.get(i);
            String text= option.getText();
            System.out.println(text);


        }

        select.selectByValue("58058");
       WebElement searchCom=  driver.findElement(By.id("gh-cat"));
       searchCom.click();
       String title=driver.getTitle();

       if( title.equalsIgnoreCase("Computers/Tablets & Networking")){
          System.out.println("The title is verified");
       }
       else{
        System.out.println("the title is incorrect");

     }




    }
}
