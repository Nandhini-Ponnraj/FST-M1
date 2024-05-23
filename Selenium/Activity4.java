package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        driver.manage().window().maximize();
        System.out.println("Title of the page is: " + driver.getTitle());
        String thirdHeader=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Title of 3rd header:"+thirdHeader);
        String fifthHeader=driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        System.out.println("color of 5th header: "+fifthHeader);
        String violet=driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println("classes of violet: "+violet);
        String grey=driver.findElement(By.xpath("//button[text()='Grey']")).getAttribute("class");
        System.out.println("classes of grey: "+grey);
        driver.close();
    }
}