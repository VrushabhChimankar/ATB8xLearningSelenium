package ATB8xVrushabh.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Handling_Booking_Site {


    @Test
    public void test_booking_site() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/flights/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //select oneway
        driver.findElement(By.xpath("(//span[@class='InputRadio-module__field___FJluj'])[2]")).click();

        //select mumbai
        Thread.sleep(2000);

        WebElement where_from = driver.findElement(By.xpath("(//span[@class='ShellButton-module__contentInner___SbZm6'])[1]"));


        Actions actions = new Actions(driver);
       actions.moveToElement(where_from).click().build().perform();

        WebElement enter_city = driver.findElement(By.xpath("//input[@placeholder='Airport or city']"));
        Thread.sleep(2000);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(enter_city).click().sendKeys("Bo").build().perform();

        Thread.sleep(2000);

        List<WebElement> list_city = driver.findElements(By.xpath("//ul[@id='flights-searchbox_suggestions']//li"));

        for (WebElement el : list_city)
        {
            if (el.getText().contains("BOM")){
                el.click();
                break;
            }
        }

        Thread.sleep(2000);

        //Select Delhi
        WebElement where_to = driver.findElement(By.xpath("(//span[@class='ShellButton-module__contentInner___SbZm6'])[3]"));

        Actions actions2 = new Actions(driver);
        actions2.moveToElement(where_to).click().build().perform();

        WebElement to_city = driver.findElement(By.xpath("//input[@placeholder='Airport or city']"));
        Thread.sleep(2000);
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(to_city).click().sendKeys("Del").build().perform();

        Thread.sleep(2000);

        List<WebElement> to_list_city = driver.findElements(By.xpath("//ul[@id='flights-searchbox_suggestions']//li"));


        for (WebElement el1 : to_list_city)
        {
            if (el1.getText().contains("DEL")){
                el1.click();
                break;
            }
        }

        //select date
        driver.findElement(By.xpath("(//span[@class='ShellButton-module__contentInner___SbZm6'])[5]")).click();


        //Calendar
        //(//h3[@class='Text-module__root--variant-strong_1___VsqoD Calendar-module__month___3JH6j'])[1]

        String month_year = "March 2025";
        String day = "11";
        while(true) {

            String calendar_year_month = driver.findElement(By.xpath("(//h3[@class='Text-module__root--variant-strong_1___VsqoD Calendar-module__month___3JH6j'])[1]")).getText();

            if (calendar_year_month.equals(month_year)){

                List<WebElement> date_list =  driver.findElements(By.xpath("//table[@class='Calendar-module__dates___D3JMK']//tbody//tr//td"));

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

                driver.findElement(By.xpath("//button[@class='Actionable-module__root___yRfSQ Button-module__root___89PKW Button-module__root--variant-tertiary___JyXN9 Button-module__root--icon-only___uc6CA Button-module__root--size-large___440LJ Button-module__root--variant-tertiary-neutral___6lLpM Calendar-module__control___ZPk59 Calendar-module__control--prev___oL5yZ']")).click();
            }
        }



        //click on Search button
        driver.findElement(By.xpath("//span[text()='Search']")).click();

        Thread.sleep(6000);

        //click on cheapest
        driver.findElement(By.xpath("//button[@id='TAB-CHEAPEST']")).click();

        List<WebElement> cheapest_flight_list = driver.findElements(By.xpath("//ul[@class='List-module__root___Y2TgH List-module__root--variant-text___jWDAB']//li"));


        //Print all the cheapest airline, duration & price
        for (WebElement el3 : cheapest_flight_list){

            String text_cheapest_flight = el3.getText();
            System.out.println(text_cheapest_flight);

            break;
        }


        driver.close();

    }


}
