package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        driver.manage().window().maximize();
        System.out.println("Title of the page: " + driver.getTitle());
        driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        driver.close();
    }
}