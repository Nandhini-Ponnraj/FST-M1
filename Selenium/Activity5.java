package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        driver.manage().window().maximize();
        System.out.println("Title of the page is: " + driver.getTitle());
        Actions action=new Actions(driver);
        action.click().build().perform();
        String side=driver.findElement(By.className("active")).getText();
        System.out.println("front value: "+side);
        action.doubleClick().build().perform();
        side=driver.findElement(By.className("active")).getText();
        System.out.println("double click value: "+side);

        action.contextClick().build().perform();
        side=driver.findElement(By.className("active")).getText();
        System.out.println("right click value: "+side);
        driver.quit();
    }
}