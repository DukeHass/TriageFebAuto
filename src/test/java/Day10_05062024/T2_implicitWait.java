package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class T2_implicitWait {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");
        WebDriver driver = new ChromeDriver(options);

        //declare and define your global inplicit wait for all web elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //navigate to google site
        driver.navigate().to("https://www.ups.com");
        driver.findElement(By.xpath("//*[text()='Tracking']")).click();
        driver.findElement(By.xpath("//*[text()='Track a Package']")).click();

    }
}
