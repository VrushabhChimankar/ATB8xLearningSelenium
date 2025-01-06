package ATB8xVrushabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Handling_SVG {

    @Test
    public void test_india_search() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']//*[local-name()='g'][7]//*[local-name()='g']//*[local-name()='path']"));

        for (WebElement state : states){
            System.out.println(state.getAttribute("aria-label"));
            if (state.getAttribute("aria-label").contains("Maharashtra")){

                Thread.sleep(3000);
                state.click();
            }

        }

    }
}
