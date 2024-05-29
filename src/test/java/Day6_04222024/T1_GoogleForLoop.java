package Day6_04222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T1_GoogleForLoop {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver variable
        WebDriver driver = new ChromeDriver();

        //declare an array list
        ArrayList<String > carBrands = new ArrayList<>();
        carBrands.add("BMW");
//        carBrands.add("Mercedes");
//        carBrands.add("Rivian");
//        carBrands.add("vans");
//        carBrands.add("adidas");
//        carBrands.add("Harley devidson");
//        carBrands.add("honda");
//        carBrands.add("mini cooper");


        for(int i = 0; i< carBrands.size();i++) {

            //navigate to google page
            driver.navigate().to("https://www.google.com");
            //maximize the chrome window
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(carBrands.get(i));

            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).submit();


            //pause the code for 3 seconds
            Thread.sleep(3000);
            String searchResult = driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
            System.out.println("search result for " +carBrands.get(i) +" is " + searchResult);
        }
//        driver.quit();
    }
}
