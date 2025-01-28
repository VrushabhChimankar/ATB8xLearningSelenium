package ATB8xVrushabh.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass_SpiceJet {

    @Test

    public void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();


        Thread.sleep(4000);
       WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
       WebElement target = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div/input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("Nagp").build().perform();
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(target).sendKeys("Bangl").build().perform();


    }

}
