package ATB8xVrushabh.Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Handling_Flipkart {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        //handle popup
        Thread.sleep(3000);       //
        //driver.findElement(By.xpath("//span[@role='button']")).click();

        //click on the mobile section
        WebElement mobile = driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[2]"));
        mobile.click();

        //scroll up the page
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 500)");

        Thread.sleep(1000);


        //using select class to select 10k & 15k
        Select select = new Select(driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]")));
        select.selectByVisibleText("₹15000");

        Thread.sleep(2000);

        Select select1 = new Select(driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[2]")));
        select1.selectByVisibleText("₹20000");


        //click realme p3 5g
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Motorola G85 5G (Olive Green, 128 GB)']")).click();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com/motorola-g85-5g-olive-green-128-gb/p/itm1c4b849213a0e?pid=MOBHY9PQMNCMDVCD&lid=LSTMOBHY9PQMNCMDVCDI6UUHQ&marketplace=FLIPKART&store=tyy%2F4io&spotlightTagId=default_BestsellerId_tyy%2F4io&srno=b_1_2&otracker=CLP_Filters&fm=organic&iid=868e36b4-4386-4506-a320-9f3be45256b8.MOBHY9PQMNCMDVCD.SEARCH&ppt=browse&ppn=browse&ssid=lqkrewaeuo0000001743682260091");

        //user clicks the links then it is jumping to the next tab

        Set<String> WindoHandle = driver.getWindowHandles();
        ArrayList<String> handle = new ArrayList();
        handle.addAll(WindoHandle);

        ////button[@class='QqFHMw vslbG+ In9uk2 JTo6b7']
        //click on cart button
        driver.findElement(By.xpath("button[@class='QqFHMw vslbG+ In9uk2 JTo6b7']")).click();


        //validate that product is in cart page or not

        String expected_title = "Motorola G85 5G (Olive Green, 128 GB)";

       WebElement cart_product = driver.findElement(By.xpath("//a[contains(text(), '" + expected_title + "')]"));
        Assert.assertTrue(cart_product.isDisplayed(), "Product is not in cart page");
        System.out.println("Product is successfully in the cart page");


        driver.close();











    }
}
