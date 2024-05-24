package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
WebDriver driver;
    @BeforeClass
    public void launch(){
        driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/");
    }

    @Test
    public void test(){
        String Actual=driver.getTitle();
        System.out.println("Actual Title of the page: "+Actual);
        String Expected="Training Support";
        Assert.assertEquals(Actual,Expected);
        driver.findElement(By.id("about-link")).click();
        String newPageActual=driver.getTitle();
        System.out.println("Title of new page: "+newPageActual);
        Assert.assertEquals(newPageActual,"About Training Support");
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
