package ATB8xVrushabh;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium02 {

@Test
public void TC1(){

    WebDriver driver = new ChromeDriver();
    driver.get("https://app.vwo.com/#/login");
    driver.quit();
}
}
