package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
    public static void main(String args[]) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page is:" + driver.getTitle());
        driver.findElement(By.id("prompt")).click();
        Alert alert=driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Text in alert: " + alertText);
        alert.sendKeys("Awesome!");

        alert.accept();
        driver.close();
    }
}
