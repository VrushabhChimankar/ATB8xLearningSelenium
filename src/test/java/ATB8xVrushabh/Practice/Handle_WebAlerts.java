package ATB8xVrushabh.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Handle_WebAlerts {

    @Test
    public void handle_alerts() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




        //simple alert
        WebElement simple_alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        simple_alert.click();
        driver.switchTo().alert().accept();

        Thread.sleep(2000);

        //confirm alert


        WebElement button = driver.findElement(By.xpath("//div[@id='CancelTab']"));
        button.click();
//

//        WebElement confirm_alert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//        confirm_alert.click();
        driver.switchTo().alert().accept();

        Thread.sleep(2000);
        //prompt alert


       // driver.findElement(By.xpath("//div[@id='Textbox']")).click();
        WebElement prompt_alert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        prompt_alert.click();
        driver.switchTo().alert().sendKeys("Vrushabh");
        driver.switchTo().alert().accept();



    }

}
