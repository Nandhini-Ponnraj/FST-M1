package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @DataProvider(name="Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password"}};
    }


    @Test(dataProvider = "Authentication")
    public void login(String uname,String pword){
      driver.findElement(By.id("username")).sendKeys(uname);
       driver.findElement(By.id("password")).sendKeys(pword);
       driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("Title "+driver.getTitle());


    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
