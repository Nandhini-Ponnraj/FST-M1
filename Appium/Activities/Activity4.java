package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static Activities.W3cActionBase.doSwipe;

public class Activity4  {


        AndroidDriver driver;
        WebDriverWait wait;


        @BeforeClass
        public void setUp() throws MalformedURLException {

            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("android");
            options.setAutomationName("UiAutomator2");
            options.setAppPackage("com.android.chrome");
            options.setAppActivity("com.google.android.apps.chrome.Main");
            options.noReset();


            URL serverURL = new URL("http://localhost:4723/wd/hub");


            driver = new AndroidDriver(serverURL, options);
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            driver.get("https://v1.training-support.net/selenium");
        }


        @Test
        public void contactsTest() throws InterruptedException {
            Dimension Dims=driver.manage().window().getSize();


         wait.until(ExpectedConditions.elementToBeClickable(
         AppiumBy.xpath("//android.widget.Button[@text='Get Started!']")
      )).click();

            Point start=new Point((int)(Dims.getWidth()*0.5),(int)(Dims.getHeight()*0.93));
            Point end=new Point((int)(Dims.getWidth()*0.5),(int)(Dims.getHeight()*0.05));

            doSwipe(driver,start,end,250);


            wait.until(ExpectedConditions.presenceOfElementLocated(
                    AppiumBy.xpath("//android.view.View[@text='To-Do List']"))).click();


            driver.findElement(AppiumBy.className("android.widget.EditText"


            )).sendKeys("NTest");

            wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.xpath("//android.widget.Button[@text='Add Task']"
                    )));
            driver.findElement(AppiumBy.xpath(
                    "//android.widget.Button[@text='Add Task']"
            )).click();


            // Wait for contact to save
           wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("large_title")));

            // Assertion
           String contactName = driver.findElement(AppiumBy.id("large_title")).getText();
            Assert.assertEquals(contactName, "Aaditya Varma");
        }

        // Tear down method
       // @AfterClass
        public void tearDown() {
            // Close the app
            driver.quit();
        }
    }

