package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    @Test
    public void login(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
        String actual=driver.findElement(By.id("action-confirmation")).getText();
        String expected="Welcome Back, admin";
        Assert.assertEquals(actual,expected);
        System.out.println("Actual confirmation:"+actual);
    }
    @AfterClass
    public void close(){
        driver.close();
    }
}
