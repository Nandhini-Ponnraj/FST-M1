package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {
    public static void main(String args[]) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Title of the page is:" + driver.getTitle());

        WebElement dropdown=driver.findElement(By.id("single-select"));
        Select select=new Select(dropdown);

        select.selectByVisibleText("Option 2");
        System.out.println("2nd option selected: "+select.getFirstSelectedOption().getText());
        select.selectByIndex(3);
        System.out.println("3rd option selected: "+select.getFirstSelectedOption().getText());
        select.selectByValue("4");
        System.out.println("4th option selected: "+select.getFirstSelectedOption().getText());
        List<WebElement> allOption=select.getOptions();
        System.out.println("All options in the dropdown: ");
        for(WebElement e: allOption){
            System.out.println(e.getText());
        }
        driver.close();
    }
}
