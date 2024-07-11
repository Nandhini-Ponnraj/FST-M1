package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {

        AndroidDriver driver;


        @BeforeClass
        public void setUp() throws MalformedURLException {

            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("android");
            options.setAutomationName("UiAutomator2");
            options.setAppPackage("com.miui.calculator");
            options.setAppActivity(".cal.CalculatorActivity");
            options.noReset();


            URL serverURL = new URL("http://localhost:4723/wd/hub");


            driver = new AndroidDriver(serverURL, options);
        }


        @Test
        public void additionTest() {

            driver.findElement(AppiumBy.id("btn_c_s")).click();

            driver.findElement(AppiumBy.id("btn_5_s")).click();
            driver.findElement(AppiumBy.accessibilityId("plus")).click();
            driver.findElement(AppiumBy.id("btn_9_s")).click();
            driver.findElement(AppiumBy.accessibilityId("equals")).click();


            String result = driver.findElement(AppiumBy.id("result")).getText();


            Assert.assertEquals(result, "= 14");
        }


        @Test
        public void subtractTest() {
            driver.findElement(AppiumBy.id("btn_c_s")).click();
            driver.findElement(AppiumBy.id("btn_1_s")).click();
            driver.findElement(AppiumBy.id("btn_0_s")).click();
            driver.findElement(AppiumBy.accessibilityId("minus")).click();
            driver.findElement(AppiumBy.id("btn_5_s")).click();
            driver.findElement(AppiumBy.accessibilityId("equals")).click();


            String result = driver.findElement(AppiumBy.id("result")).getText();


            Assert.assertEquals(result, "= 5");
        }


        @Test
        public void multiplyTest() {
            // Perform the calculation
            driver.findElement(AppiumBy.id("btn_c_s")).click();
            driver.findElement(AppiumBy.id("btn_5_s")).click();
            driver.findElement(AppiumBy.accessibilityId("multiply")).click();
            driver.findElement(AppiumBy.id("btn_1_s")).click();
            driver.findElement(AppiumBy.id("btn_0_s")).click();
            driver.findElement(AppiumBy.id("btn_0_s")).click();
            driver.findElement(AppiumBy.accessibilityId("equals")).click();


            String result = driver.findElement(AppiumBy.id("result")).getText();


            Assert.assertEquals(result, "= 500");
        }


        @Test
        public void divideTest() {
            driver.findElement(AppiumBy.id("btn_c_s")).click();
            driver.findElement(AppiumBy.id("btn_5_s")).click();
            driver.findElement(AppiumBy.id("btn_0_s")).click();
            driver.findElement(AppiumBy.accessibilityId("divide")).click();
            driver.findElement(AppiumBy.id("btn_2_s")).click();
            driver.findElement(AppiumBy.accessibilityId("equals")).click();


            String result = driver.findElement(AppiumBy.id("result")).getText();


            Assert.assertEquals(result, "= 25");
        }


        @AfterClass
        public void tearDown() {

            driver.quit();
        }
    }

