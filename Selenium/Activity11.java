package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        driver.manage().window().maximize();
        WebElement checkbox = driver.findElement(By.name("toggled"));
        System.out.println("Title of the page" + driver.getTitle());
        System.out.println("Is checkbox selected?: "+checkbox.isSelected());

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();


        System.out.println("Is checkbox selected?: "+checkbox.isSelected());
        driver.close();

    }
}
