package class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 //Notes:when ever it's we open page , it's generate unique number.
public class WindowHandle {
    public static void main(String[] args) {
        // open chrome _browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  crate instance variable
        WebDriver driver= new ChromeDriver();
        // go to gamail signup page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        //     maximize
        driver.manage().window().maximize();
        // get the window handle
        String gmailHandle= driver.getWindowHandle();
        // print
        System.out.println("The Handle of the curent page is "+gmailHandle);

    }
}
