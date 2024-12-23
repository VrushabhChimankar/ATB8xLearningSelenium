package ex_23_12_2024_SeleniumProject01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProject01 {

    @Test
    public void TC_01(){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        //find email_input_box
        WebElement email_input = driver.findElement(By.id("login-username"));
        email_input.sendKeys("qwertyuio");

        //find password_input_box
        WebElement password_input = driver.findElement(By.name("password"));
        password_input.sendKeys("12345");

        // click on the login button
        WebElement click_login = driver.findElement(By.id("js-login-btn"));
        click_login.click();

        //verify the text
       WebElement error_message = driver.findElement(By.className("notification-box-description"));

       //Your email, password, IP address or location did not match
      Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");





    }
}
