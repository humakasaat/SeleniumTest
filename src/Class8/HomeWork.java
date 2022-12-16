package Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork {
    public static void main(String[] args) {
 //   open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
 //  create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//   got to the...
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
//   click on checkbox and click on remove
      WebElement checkbox= driver.findElement(By.xpath("//input[@ type='checkbox']"));
      checkbox.click();

      WebElement remove  =driver.findElement(By.xpath("//button[text()='Remove']"));
      remove.click();
 //   verify the text
       WebElement text= driver.findElement(By.xpath("//p[@id='message']"));
        String verifyText= text.getText();
        if( text.getText().equalsIgnoreCase("It's gone!")){
            System.out.println(  " "+ verifyText+"  is verified ");

        } else {
            System.out.println(verifyText+ " is not verified");
        }
//   click on enable verify the text-box is enabled
       WebElement enableButton= driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();
        WebElement enableText = driver.findElement(By.xpath("//p[@id='message']"));
        String verifyEnableText= enableText.getText();
        if(enableText.getText().equalsIgnoreCase("It's enabled!")){
            System.out.println(verifyEnableText+" / the text-box is enabled");
        } else{
            System.out.println(" the text box is not enabled ");
        }
//     //enter text and click disable
        WebElement textTexBox = driver.findElement(By.xpath("//input[@type='text']"));
        textTexBox.sendKeys("Hello");
        WebElement disableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();
//   verify the text-box is disabled
        WebElement disableText=  driver.findElement(By.xpath("//p[@id='message']"));
        String disText= disableText.getText();
        if (disableText.getText().equalsIgnoreCase("It's disabled!")){
            System.out.println(" the text/"+ disText+" /is verified " );
        }
        else{
            System.out.println(" the text "+ disText+ " not verified");
        }


    }
}








//click on checkbox and click on remove
//verify the text
//click on enable verify the textbox is enabled
//enter text and click disable
//verify the textbox is disabled