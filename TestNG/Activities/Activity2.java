package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    private static final Logger log = LoggerFactory.getLogger(Activity2.class);
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        log.info("Launching the browser");
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void launch(){
        String expected="Target Practice";
        String actual=driver.getTitle();
        Assert.assertEquals(expected,actual);

        System.out.println("Title of the page: "+actual);

    }


    @Test
    public void test(){

        String blackbutton=driver.findElement(By.xpath("//button[text()='Black']")).getText();

        System.out.println("actual button name: "+blackbutton);
        String Expected="Training Support";
        Assert.assertEquals(blackbutton,Expected);
        log.info("Test2 failed");
    }
    @Test(enabled = false)
    public void skip1(){
        System.out.println("This will be skipped");
    }

    @Test()
    public void skip2(){
throw new SkipException("Skipping from exception");
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
