package ATB8xVrushabh.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumProject04 {


    @Test
    public void TC01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        //enter firstname and lastname
        WebElement enter_fname = driver.findElement(By.name("firstname"));
        enter_fname.sendKeys("Vrushabh");

        WebElement enter_lname = driver.findElement(By.name("lastname"));
        enter_lname.sendKeys("Chimankar");

        //click on male

        WebElement click_male = driver.findElement(By.id("sex-0"));
        click_male.click();

        //click one
        WebElement click_one = driver.findElement(By.id("exp-1"));
        click_one.click();

        //enter date
        WebElement enter_date = driver.findElement(By.id("datepicker"));
        enter_date.click();

        //click Manual Tester
        WebElement click_manual_tester = driver.findElement(By.id("profession-0"));
        click_manual_tester.click();



    }
}
