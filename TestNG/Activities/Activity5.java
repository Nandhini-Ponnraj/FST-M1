package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity5 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest(alwaysRun = true)
    public void setup(){
        driver=new FirefoxDriver();
       wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(groups={"HeaderTest","ButtonTest"})
    public void launch(){

        String title=driver.getTitle();
        System.out.println("Title of the page: "+title);

    }
    @Test(groups = {"HeaderTest"})
    public void Test3rdHeader(){

        WebElement thirdHeader = driver.findElement(By.cssSelector("h3#third-header"));
String Expected="Third header";
Assert.assertEquals(thirdHeader.getText(),Expected,"Third header title matches!");
    }

    @Test(groups={"HeaderTest"})
    public void Test5thHeader(){
WebElement fifthHeader=driver.findElement(By.cssSelector("h5.ui.green.header"));
String expected="rgb(33, 186, 69)";
Assert.assertEquals(fifthHeader.getCssValue("color"),expected,"Green header Color matches!");
    }
    @Test(groups = {"ButtonTest"})
    public void TestButton1(){
String olivebutton=driver.findElement(By.xpath("//button[@class='ui olive button']")).getText();
Assert.assertEquals(olivebutton,"Olive","Button color olive matches!");
    }

    @Test(groups={"ButtonTest"})
    public void TestButton2(){
String brownbutton=driver.findElement(By.xpath("//button[@class='ui brown button']")).getCssValue("color");
Assert.assertEquals(brownbutton,"rgb(255, 255, 255)","Brown button matches!");
    }


    @AfterTest(alwaysRun = true)
    public void close(){
        driver.close();
    }



}
