package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_04 {
    public static void main(String[] args) throws InterruptedException {
        //declare and defin chrome options
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");

        //run headless mode (code runs in the background)
        // options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.weightwatchers.com/us/");
        Thread.sleep(2000);
        driver.findElements(By.xpath("//*[contains(@data-e2e-name , 'find_a workshop')]")).get(0).click(); // driver.findElement(By.xpath("//*[text() = 'find_a workshop']")).click();
        Thread.sleep(2000);
        ArrayList<String > zipCode = new ArrayList<>();
        zipCode.add("19713");
        zipCode.add("11210");
        zipCode.add("20707");
        for(int i = 0; i< zipCode.size();i++) {
            WebElement findInPersonLocation = driver.findElement(By.xpath("//*[contains(@id , 'location-search')]"));
            findInPersonLocation.clear();
            findInPersonLocation.sendKeys(zipCode.get(i));
            driver.findElements(By.xpath("//*[contains(@type , 'submit')]")).get(0).click();
            Thread.sleep(3000);
           ArrayList<WebElement> locationStudio =  new ArrayList<> (driver.findElements(By.xpath("//*[contains(@class , 'linkUnderline-XyxpJ')]")));
           int a = 0;
           int b = 1;
           int c = 2;
            if (a<b){
                locationStudio.get(0).click();
                String searchResult = driver.findElement(By.xpath("//*[@class='address-FnT8k']")).getText();
                System.out.println("search result is "+searchResult);
            }else if(c<b){
                locationStudio.get(1).click();
                String searchResult = driver.findElement(By.xpath("//*[@class='address-FnT8k']")).getText();
                System.out.println("search result is "+searchResult);
            }
            Thread.sleep(3000);
            driver.findElements(By.xpath("//*[contains(@data-e2e-name , 'find_a workshop')]")).get(0).click();
        }

        }
    }

