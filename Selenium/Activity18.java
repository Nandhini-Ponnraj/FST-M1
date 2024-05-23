package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18 {
    public static void main(String args[]) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Title of the page is:" + driver.getTitle());

        WebElement dropdown = driver.findElement(By.id("multi-select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Javascript");
        for(int i=4;i<=6;i++) {
            select.selectByIndex(i);
        }
        select.selectByValue("node");
        System.out.println("All the options selected before 5th element deselection: ");
        List<WebElement> allselected_before=select.getAllSelectedOptions();
        for(WebElement selected:allselected_before){
            System.out.println(selected.getText());
        }
        select.deselectByIndex(5);
        List<WebElement> allselected_after=select.getAllSelectedOptions();
        System.out.println("All the options selected after 5th element deselection: ");
        for(WebElement selected:allselected_after){
            System.out.println(selected.getText());
        }
        driver.close();



    }
}
