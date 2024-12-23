package ATB8xVrushabh.ex_23_12_2024_SeleniumProject02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumProject02 {

    @Test
    public void TC_01(){


        //https://vwo.com/free-trial
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vwo.com/free-trial");

        //enter email
        WebElement email_input = driver.findElement(By.id("page-v1-step1-email"));
        email_input.sendKeys("12345678");

        //click checkbox
        WebElement click_checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        click_checkbox.click();

        //click Create button

       List <WebElement> create_button = driver.findElements(By.tagName("button"));
       create_button.get(0).click();

       // Verify this text = > "The email address you entered is incorrect."

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");

        driver.quit();

    }

}
