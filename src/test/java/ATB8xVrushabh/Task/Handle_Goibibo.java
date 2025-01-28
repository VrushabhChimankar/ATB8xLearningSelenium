package ATB8xVrushabh.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Handle_Goibibo {

    @Test

    public void test_goibibo() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();

        //enter nagpur
        WebElement from_city = driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']/div/p"));

        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(from_city).click().sendKeys("Nag").build().perform();

        Thread.sleep(2000);

        List<WebElement> cities = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
        for (WebElement e : cities){
            if (e.getText().contains("Nagpur")){
                e.click();
                break;
            }

        }

        //enter pune

        WebElement to_city = driver.findElement(By.xpath("//div[@class='sc-12foipm-22 OmQvV']/div/p"));
        Thread.sleep(2000);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(to_city).click().sendKeys("Pun").build().perform();

        Thread.sleep(2000);

        List<WebElement> cities_list = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));

        for (WebElement el : cities_list){
            if (el.getText().contains("Pune")){
                el.click();
                break;
            }
        }

        //select date
        driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();

        String month_year = "April 2025";
        String day = "30";
        while(true) {

            String calendar_year_month = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();

            if (calendar_year_month.equals(month_year)){

              List<WebElement> date_list =  driver.findElements(By.xpath("//div[@class='DayPicker-Body']//div"));

              for (WebElement ec : date_list){
                  String calendar_day = ec.getText();
                  if (calendar_day.equals(day)){
                      ec.click();
                      break;
                  }

              }
              break;
            }
            else {

                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            }
        }

        //click on search flights
        driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();

        Thread.sleep(20000);
        //click on view fares button
//       WebElement view_fares = driver.findElement(By.xpath("//button[text()='VIEW FARES']"));
//        Actions actions2 = new Actions(driver);
//        actions2.moveToElement(view_fares).build().perform();












    }
}
