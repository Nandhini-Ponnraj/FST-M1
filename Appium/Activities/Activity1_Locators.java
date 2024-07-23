package Activities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1_Locators {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.miui.calculator");
        options.setAppActivity(".cal.CalculatorActivity");//".cal.CalculatorActivity
        options.noReset();

       
        URL serverURL = new URL("http://localhost:4723/wd/hub");

       
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void multiplyTest() {
        driver.findElement(AppiumBy.id("btn_7_s")).click();
      
        driver.findElement(AppiumBy.accessibilityId("Multiply")).click();
      
        driver.findElement(AppiumBy.id("btn_5_s")).click();
        //Find "=" and tap it
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String result = driver.findElement(AppiumBy.id("result")).getText();

        // Assertion
        Assert.assertEquals(result, "= 35");
    }
}

