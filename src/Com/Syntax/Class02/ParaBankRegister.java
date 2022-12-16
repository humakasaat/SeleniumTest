package Com.Syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankRegister {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Huma");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kasaat");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 spring Road");
        driver.findElement(By.id("customer.address.city")).sendKeys("Brambelton");
        driver.findElement(By.id("customer.address.state")).sendKeys("Va");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20148");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("571-345-678");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-689");
        driver.findElement(By.id("customer.username")).sendKeys("humaKasaat");
        driver.findElement(By.id("customer.password")).sendKeys("Apple@123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Apple@123");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
