package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T3_explicitWait {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.ups.com");
        //declare explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //click on tracking
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking']"))).click();

        } catch (Exception e) {
            System.out.println("Unable to click on Tracking " + e);
        }
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();

        } catch (Exception e) {
            System.out.println("Unable to click on Track a Package " + e);
        }
    }
}
