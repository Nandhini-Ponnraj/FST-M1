package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        driver.manage().window().maximize();
        WebElement checkbox=driver.findElement(By.className("willDisappear"));
        System.out.println("Title of the page" + driver.getTitle());

        System.out.println("Is checkbox visible?: "+checkbox.isDisplayed());
        checkbox.click();

        WebElement button=driver.findElement(By.id("toggleCheckbox"));
        button.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        System.out.println("Is checkbox visible?: "+checkbox.isDisplayed());
        driver.close();


    }
}
