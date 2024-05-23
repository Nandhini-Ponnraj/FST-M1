package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        driver.manage().window().maximize();
        System.out.println("Title of the page" + driver.getTitle());
        WebElement textfield=driver.findElement(By.id("input-text"));
        System.out.println("Is text field enabled?: "+textfield.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("Is text field enabled?: "+textfield.isEnabled());
        driver.close();


    }
}
