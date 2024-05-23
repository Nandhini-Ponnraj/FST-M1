package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        driver.manage().window().maximize();
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        System.out.println("No of rows: "+rows.size());
        List<WebElement> columns=driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
        System.out.println("No of columns: "+columns.size());
        List<WebElement> thirdRow=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        System.out.println("3rd row data: ");
        for(WebElement cell:thirdRow){
            System.out.println("3rd row data: "+cell.getText());
        }
        WebElement secRow=driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        System.out.println("2nd row 2nd cell data: "+secRow.getText());
        driver.close();

    }
}
