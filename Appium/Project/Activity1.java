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

public class Activity1 {
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
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Test method
    @Test
    public void GoogleTaskTest() {
        // Find and click the add button
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();

        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")
        ));

        // Enter the details for Task1
        driver.findElement(AppiumBy.id(
                "com.google.android.apps.tasks:id/add_task_title"
        )).sendKeys("Complete Activity with Google Tasks");
        //click on Save
        driver.findElement(AppiumBy.id(
                "com.google.android.apps.tasks:id/add_task_done"
        )).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        // Enter the details for Task2
        driver.findElement(AppiumBy.id(
                "com.google.android.apps.tasks:id/add_task_title"
        )).sendKeys("Complete Activity with Google Keep");
        //click on Save
        driver.findElement(AppiumBy.id(
                "com.google.android.apps.tasks:id/add_task_done"
        )).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
// Enter the details for Task3
        driver.findElement(AppiumBy.id(
                "com.google.android.apps.tasks:id/add_task_title"
        )).sendKeys("Complete the 2nd Activity with Google Keep");
        //click on Save
        driver.findElement(AppiumBy.id(
                "com.google.android.apps.tasks:id/add_task_done"
        )).click();

        // Assertion
        String Title1 = driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@resource-id=\"com.google.android.apps.tasks:id/task_data\"])[3]")).getText();
        Assert.assertEquals(Title1, "Complete Activity with Google Tasks");
        String Title2 = driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@resource-id=\"com.google.android.apps.tasks:id/task_data\"])[2]")).getText();
        Assert.assertEquals(Title2, "Complete Activity with Google Keep");
        String Title3 = driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@resource-id=\"com.google.android.apps.tasks:id/task_data\"])[1]")).getText();
        Assert.assertEquals(Title3, "Complete the 2nd Activity with Google Keep");
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}

