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

public class Activity2 {
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
        )).sendKeys("Google Keep Note1 Title");
        driver.findElement(AppiumBy.id(
                "com.google.android.keep:id/edit_note_text"
        )).sendKeys("Google Keep Note1 Text content");

        // press back
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();

        // Wait for contact to save
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/index_note_title")));

        // Assertion
        String Title = driver.findElement(AppiumBy.id("com.google.android.keep:id/index_note_title")).getText();
        Assert.assertEquals(Title, "Google Keep Note1 Title");
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}

