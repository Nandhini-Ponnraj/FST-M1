package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Activity6 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username","password"})
    public void login(String username,String password){
       driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
        String confirmation=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println(confirmation);
    }



    @AfterClass
    public void close(){
        driver.close();
    }
}
