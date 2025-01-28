package ATB8xVrushabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class ActionClass_Goibibo {

    @Test
    public void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();

        WebElement source = driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']/div/p"));

        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("Mum").build().perform();

        Thread.sleep(3000);
        List<WebElement> cities = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
        for (WebElement e : cities){
            if (e.getText().contains("Mumbai")){
                e.click();
                break;
            }
        }




    }
}
