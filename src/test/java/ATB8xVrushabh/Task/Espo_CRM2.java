package ATB8xVrushabh.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Espo_CRM2 {


        @Test
        public void Test01() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.us.espocrm.com/#");
            driver.manage().window().maximize();


            Thread.sleep(3000);
            driver.findElement(By.id("btn-login")).click();

            Thread.sleep(8000);
            driver.findElement(By.xpath("(//span[text()='Accounts'])[1]")).click();

            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@title='Ctrl+Space']")).click();

            Thread.sleep(3000);
            //Click Save
            WebElement click_save = driver.findElement(By.xpath("//button[text()='Save']"));
            click_save.click();

            String Expected = "Not Valid";

            String error_message = driver.findElement(By.tagName("Body")).getText();

            if (error_message.contains(Expected)){

                Assert.assertTrue(true);
            }
            else
            {
                Assert.assertTrue(false);
            }



        }

}
