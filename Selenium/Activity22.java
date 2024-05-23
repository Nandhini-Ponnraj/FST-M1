package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity22 {

    public static void main(String args[]) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/popups");
        System.out.println("Title of the page is:" + driver.getTitle());
        Actions action=new Actions(driver);
        WebElement button=driver.findElement(By.xpath("//button[@class='ui huge inverted orange button']"));
        action.moveToElement(button).build().perform();
        String tooltip=button.getAttribute("data-tooltip");
        System.out.println("Tooltip: "+tooltip);
        button.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String logintext=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("action-confirmation")))).getText();

        System.out.println(logintext);
        driver.close();
    }
}
