package ATB8xVrushabh.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium05_iDriveEnterprise {


    @Test
    public void Test01() throws InterruptedException {

//            email - augtest_040823@idrive.com
//            password - 123456


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();


        Thread.sleep(3000);

       WebElement username_input =  driver.findElement(By.id("username"));
       username_input.sendKeys("augtest_040823@idrive.com");


        WebElement pass_input = driver.findElement(By.id("password"));
        pass_input.sendKeys("123456");

        //click Sign in button

       driver.findElement(By.id("frm-btn")).click();
       Thread.sleep(3000);

       String Expected_title = "Your free trial has expired";
       WebElement text_message = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));

       String Actual_Title = text_message.getText();
        if (Actual_Title.equals(Expected_title)){

            System.out.println("Test case passed!");
        }
        else
        {
            System.out.println("Test case failed");
        }

    }
}
