package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLImageElement;

import static java.time.Duration.ofSeconds;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Activity21 {
    public static void main(String args[]) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        System.out.println("Title of the page is:" + driver.getTitle());
        String parentWindow=driver.getWindowHandle();
        driver.findElement(By.id("launcher")).click();
        Set< String> alltab=driver.getWindowHandles();
        for(String tab:alltab){
            if(tab.equals(parentWindow)){
                System.out.println("Currently in parent window : "+driver.getTitle());
        }
            else {

                driver.switchTo().window(tab);
                System.out.println("Switching to Child1 window");
            }

        }
        String child1=driver.getWindowHandle();
        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(15));
         wait1.until(ExpectedConditions.numberOfWindowsToBe(2));
        wait1.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("Child1 window Title: "+driver.getTitle());
         wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='newtab2']"))).click();
        for(String handle3:driver.getWindowHandles()){
            if(handle3.equals(child1)){
                System.out.println("Currently in child1 window: "+driver.getTitle());
            } else if (handle3.equals(parentWindow)) {
                System.out.println("This handle refers to parent window");
            }
            else {

                driver.switchTo().window(handle3);
                System.out.println("Switching to Child2 window");
            }
        }
        //String child2=driver.getWindowHandle();
        wait1.until(ExpectedConditions.numberOfWindowsToBe(3));
wait1.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("child2 window title: "+driver.getTitle());
        driver.quit();


    }

}
