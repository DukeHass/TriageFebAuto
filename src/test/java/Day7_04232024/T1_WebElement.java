package Day7_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_WebElement {
    public static void main(String[] args) throws InterruptedException {
        //declare and defin chrome options
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");

        //run headless mode (code runs in the background)
        // options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);

        //go to mortgage calculator website
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //declare and store home value webelement
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.clear();
        homeValue.sendKeys("950000");
        Thread.sleep(2000);
    }
}
