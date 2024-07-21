package Activities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity5 {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.mms");
        options.setAppActivity(".ui.MmsTabActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Test method
    @Test
    public void smsTest() throws InterruptedException {
        // Find and click the add button
        driver.findElement(AppiumBy.id("com.android.mms:id/fab")).click();

        // Wait for elements to load
       wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.id("com.android.mms:id/recipients_viewer")
        )).click();
       Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.android.mms:id/recipients_viewer")).sendKeys("8056551810");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                AppiumBy.id("com.android.mms:id/recipients_viewer"),"8056551810"));

        // Find the element to add recipient

        // Press ENTER
        driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));

        // Wait for textbox to appear
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.mms:id/embedded_text_editor")));

        // Enter text to send
        driver.findElement(AppiumBy.id("com.android.mms:id/embedded_text_editor")).sendKeys("Hello from Appium");
        // Press Send
        driver.findElement(AppiumBy.id("com.android.mms:id/send_button")).click();

        // Assertion
        String messageTextSent = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"com.android.mms:id/message_body\"])[5]")).getText();
        Assert.assertEquals(messageTextSent, "Hello from Appium");
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}