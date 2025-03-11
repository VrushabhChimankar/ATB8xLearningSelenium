package ATB8xVrushabh.ex_06012025;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExecutor {

    @Test
    public void test01_JSExecutor(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        //Javascript executor
        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement scroll_page = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView();", scroll_page);
        driver.quit();





    }
}
