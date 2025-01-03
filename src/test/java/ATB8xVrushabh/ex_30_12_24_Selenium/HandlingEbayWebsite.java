package ATB8xVrushabh.ex_30_12_24_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class HandlingEbayWebsite {


    @Test
    public void Test01(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        driver.manage().window().maximize();

        WebElement SearchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        SearchBox.sendKeys("minimac");

        WebElement click_search = driver.findElement(By.xpath("//input[@id ='gh-btn']"));
        click_search.click();

        List<WebElement> SearchTitle = driver.findElements(By.xpath("//div[@class='s-item__title']"));
        List<WebElement> SearchTitlePrice = driver.findElements(By.xpath("//span[@class='s-item__price']"));


        int size = Math.min(SearchTitlePrice.size(), SearchTitle.size());

        for (int i = 0; i < size; i++) {

            System.out.println("Title: " + SearchTitle.get(i).getText() + " || " + "Price: " + SearchTitlePrice.get(i).getText());


        }

        driver.quit();




    }
}
