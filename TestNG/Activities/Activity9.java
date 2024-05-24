package Activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity9 {
    WebDriver driver;
    Alert alert;
    @BeforeTest
    public void launch(){
        driver=new FirefoxDriver();
        Reporter.log("Launching url");
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

    }
@BeforeMethod
public void defaultPage(){
    Reporter.log("Switching to main page");
        driver.switchTo().defaultContent();
    }
    @Test
    public void simpleAlertTestCase(){
       driver.findElement(By.xpath("//button[@id='simple']")).click();
        Reporter.log("Switching to Simple alert");
       alert=driver.switchTo().alert();
       String msg=alert.getText();
        Reporter.log("Getting msg present in Simple alert");
        System.out.println("Simple alert msg: "+msg);

    }
    @Test
    public void confirmAlertTestCase(){
//
        driver.findElement(By.xpath("//button[@id='confirm']")).click();
        Reporter.log("Switching to Confirmation alert");
        alert=driver.switchTo().alert();
        String confirmAlert=alert.getText();
        Reporter.log("Getting msg from Confirmation alert");
        System.out.println("Confirm alert msg: "+confirmAlert);
        alert.accept();
        Reporter.log("Accepted Confirmation alert");
    }
    @Test
    public void promptAlertTestCase(){
        Reporter.log("Clicking on Prompt button");
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
        Reporter.log("Switching to Prompt alert");
        alert=driver.switchTo().alert();
        Reporter.log("Getting msg from Prompt alert");
        String promptAlert=alert.getText();
        Reporter.log("Entering text in prompt alert input field");
        alert.sendKeys("Test");
        try{
            Reporter.log("Trying to accept prompt alert");
        alert.accept();
            Reporter.log("Accepted prompt alert");
        }
        catch (UnhandledAlertException e){
            Reporter.log("Handling prompt alert exception");
            System.out.println("delayed to accept");
        }
        Reporter.log("Getting text from prompt alert");
        System.out.println("Prompt alert msg: "+promptAlert);

    }

    @AfterTest(alwaysRun = true)
    public void close(){
        Reporter.log("Closing the browser");
        driver.quit();
    }
}