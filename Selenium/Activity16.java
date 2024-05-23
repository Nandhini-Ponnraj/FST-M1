package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        driver.manage().window().maximize();
        System.out.println("Title of the page: " + driver.getTitle());
        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("admin1");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("password1");
        driver.findElement(By.xpath("//label[text()='Confirm Password']/following-sibling::input")).sendKeys("password1");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@test.com");

        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        driver.close();
    }
}
