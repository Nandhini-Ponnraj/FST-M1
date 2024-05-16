package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Activity1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println("Title of the page is: "+title);
        WebElement About_us=driver.findElement(By.id("about-link"));
        About_us.click();
        String new_title= driver.getTitle();
        System.out.println("Title of the next page is: "+new_title);
        driver.close();
    }

}
