package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
   public static void main(String args[]){
       WebDriverManager.firefoxdriver().setup();
       WebDriver driver=new FirefoxDriver();
       driver.get("https://v1.training-support.net/selenium/drag-drop");
       System.out.println("Title of the page is:"+driver.getTitle());
       Actions action=new Actions(driver);
       WebElement source=driver.findElement(By.id("draggable"));
       WebElement target1=driver.findElement(By.id("droppable"));
       WebElement target2=driver.findElement(By.id("dropzone2"));
       action.dragAndDrop(source,target1).build().perform();
       String dropzone1Verify = target1.findElement(By.tagName("p")).getText();
       if(dropzone1Verify.equals("Dropped!")) {
           System.out.println("Ball was dropped in dropzone 1");
       }
       action.clickAndHold(source).moveToElement(target2).pause(2000).release().build().perform();
       String dropzone2Verify = target2.findElement(By.tagName("p")).getText();
       if(dropzone2Verify.equals("Dropped!")) {
           System.out.println("Ball was dropped in dropzone 2");
       }
       driver.close();
   }

}
