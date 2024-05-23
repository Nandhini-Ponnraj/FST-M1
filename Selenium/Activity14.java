package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("Title of the page: "+driver.getTitle());
        driver.manage().window().maximize();
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        List<WebElement> col=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("No of rows: "+rows.size());
        System.out.println("No of columns: "+col.size());
        String secondRow_secondCol=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Text at 2nd row 2nd column: "+secondRow_secondCol);
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String secondRow_secondCol1=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Text at 2nd row 2nd column now: "+secondRow_secondCol1);
        List<WebElement> footer=driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        for(WebElement cell:footer){
        System.out.println("Footer cell: "+cell.getText());
        }
        driver.close();



    }

}
