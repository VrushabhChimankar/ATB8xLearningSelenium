package ATB8xVrushabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTablesPart2 {

    @Test

    public void test01_webtables(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        driver.manage().window().maximize();


        //row = //table[@id='countries']/tbody/tr
        //col = //table[@id='countries']/tbody/tr[2]/td

        int row = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(col);

        String first_part = "//table[@id='countries']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";


        for (int i = 2; i<=row; i++){
            for (int j = 1; j<=col; j++){
                String dynamic_xpath = first_part + i + second_part + j + third_part;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);

                if (data.contains("Lek")){

                    String capital = dynamic_xpath+"/following-sibling::td";
                    String language = dynamic_xpath+"/preceding-sibling::td";

                    String capital1 = driver.findElement(By.xpath(capital)).getText();
                    String language1 = driver.findElement(By.xpath(language)).getText();

                    System.out.println("-------------");
                    System.out.println("Lek capital is: " + capital1);
                    System.out.println("Lek language is: " + language1);



                }


            }
        }






    }
}
