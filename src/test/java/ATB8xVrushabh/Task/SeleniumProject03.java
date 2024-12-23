package ATB8xVrushabh.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProject03 {


    @Test
    public void TC_01(){

        //https://katalon-demo-cura.herokuapp.com/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //click on Make Appointment button
        WebElement click_make_appointment = driver.findElement(By.id("btn-make-appointment"));
        click_make_appointment.click();

        //enter username
        WebElement enter_username = driver.findElement(By.id("txt-username"));
        enter_username.sendKeys("John Doe");

        //enter password
        WebElement enter_pass = driver.findElement(By.id("txt-password"));
        enter_pass.sendKeys("ThisIsNotAPassword");

        //click submit button
        WebElement click_submit = driver.findElement(By.id("btn-login"));
        click_submit.click();

        //verify
        //https://katalon-demo-cura.herokuapp.com/#appointment

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();


    }
}
