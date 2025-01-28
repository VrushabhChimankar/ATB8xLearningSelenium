package ATB8xVrushabh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class ActionClass_MakeMyTrip {
    @Test
    public void test_01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

        WebElement from_city =  driver.findElement(By.xpath("//input[@id='fromCity']"));

        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(from_city).click().sendKeys("Nag").build().perform();

        //to select the Nagpur :
       //This statement is enough to select Nagpur :
        // actions.moveToElement(from_city).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
        Thread.sleep(3000);

        List<WebElement> Cities = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

        for (WebElement e : Cities){

            if (e.getText().contains("Nagpur")){
                e.click();
                break;
            }

        }




    }
}
