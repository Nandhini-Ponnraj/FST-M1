package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/ajax");
        driver.manage().window().maximize();
        System.out.println("Title of the page"+driver.getTitle());
        driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
        String text1=driver.findElement(By.tagName("h1")).getText();
        System.out.println(text1);
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        String text3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3"))).getText();
       System.out.println(text3);
       WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
       wait1.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"),"I'm late"));
        String text4=driver.findElement(By.tagName("h3")).getText();
        System.out.println(text4);
    }
}
