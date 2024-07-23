package Project;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
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

public class Activity3 {
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
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Test method
    @Test
    public void GoogleKeepTest1() {
        // Find and click the add button
        driver.findElement(AppiumBy.id("com.google.android.keep:id/new_note_button")).click();

        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.id("com.google.android.keep:id/editable_title")
        ));

        // Enter the details
        driver.findElement(AppiumBy.id(
                "com.google.android.keep:id/editable_title"
        )).sendKeys("Google Keep Note2 Title for Reminder");
        driver.findElement(AppiumBy.id(
                "com.google.android.keep:id/edit_note_text"
        )).sendKeys("Google Keep Note2 Text content");
        //com.google.android.keep:id/menu_reminder
        driver.findElement(AppiumBy.id(
                "com.google.android.keep:id/menu_reminder"
        )).click();
        //reminder //android.widget.TextView[@resource-id="com.google.android.keep:id/menu_text" and @text="Choose a date & time"]
        driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.keep:id/menu_text\" and @text=\"Choose a date & time\"]"
        )).click();
        //press afternoon //android.widget.TextView[@resource-id="com.google.android.keep:id/text" and @text="8:00 am"]

        driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.keep:id/text\" and @text=\"8:00 am\"]"
        )).click();
        driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.keep:id/text\" and @text=\"Afternoon\"]"
        )).click();
        //save
        driver.findElement(AppiumBy.id(
                "com.google.android.keep:id/save"
        )).click();
        // press back
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();

        // Wait for contact to save
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/index_note_title")));

        // Assertion
        String Title = driver.findElement(AppiumBy.id("com.google.android.keep:id/index_note_title")).getText();
        Assert.assertEquals(Title, "Google Keep Note2 Title for Reminder");
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}

