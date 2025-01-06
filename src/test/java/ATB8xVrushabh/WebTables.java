package ATB8xVrushabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTables {


    @Test

    public  void test_webtables() throws InterruptedException {

        String url = "https://awesomeqa.com/webtable.html";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();


        //row = "//table[@id='customers']/tbody/tr"
        //col = //table[@id='customers']/tbody/tr[2]/td
       int row =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
       int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(col);

        String first_part = "//table[@id='customers']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

       for (int i = 2; i<=row; i++){
           for (int j = 1; j<=col; j++){

               String dynamic_xpath = first_part + i + second_part + j + third_part;

              String data = driver.findElement(By.xpath(dynamic_xpath)).getText();

               System.out.println(data);

               if (data.contains("Helen Bennett")){

                   String country_xpath = dynamic_xpath+"/following-sibling::td";
                   String country_company = dynamic_xpath+"/preceding-sibling::td";


                   Thread.sleep(2000);
                   String country_text = driver.findElement(By.xpath(country_xpath)).getText();
                   String company_text = driver.findElement(By.xpath(country_company)).getText();

                   System.out.println("--------------");
                   System.out.println("Helen Bennett country name is: " + country_text);
                   System.out.println("Helen Bennett company name is" + company_text);
               }



           }
       }

    }
}
