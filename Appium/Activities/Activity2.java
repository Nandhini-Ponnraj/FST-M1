package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity2 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options option=new UiAutomator2Options();

        option.setPlatformName("android");
        option.setAutomationName("UiAutomator2");
        option.setAppPackage("com.android.chrome");
        option.setAppActivity("com.google.android.apps.chrome.Main");
        option.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
// Driver Initialization
        driver = new AndroidDriver(serverURL, option);
        driver.get("https://v1.training-support.net");
    }
    @Test
    public void aboutUs() throws InterruptedException {
       wait=new WebDriverWait(driver, Duration.ofSeconds(40));
      WebElement h= wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View//android.widget.TextView[@text='Training Support']")));

        String heading=driver.findElement(AppiumBy.xpath(
        "//android.widget.TextView[@text='Training Support']"
)).getText();
       System.out.println("Heading of the page is: "+heading);
       Thread.sleep(20);
        driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='about-link']")).click();
       String newHeading=driver.findElement(AppiumBy.xpath(
                "//android.view.View[@text='About Us']"
        )).getText();
        System.out.println("Heading of new page: "+newHeading);
    }
    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}
