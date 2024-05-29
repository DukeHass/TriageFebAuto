package Day7_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_WebElements {
    public static void main(String[] args) throws InterruptedException {
        //declare and defin chrome options
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");

        //run headless mode (code runs in the background)
//        options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);

        //go to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");

        ArrayList<WebElement> yahooHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class , '_yb_jujrfs _yb_126z4i9  _yb_r25x6s')]"))   );

        for (int i = 0;i < yahooHeaders.size(); i++){
            System.out.println("Yeahoo headers are " + yahooHeaders.get(i).getText());
        }
        yahooHeaders.get(2).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
