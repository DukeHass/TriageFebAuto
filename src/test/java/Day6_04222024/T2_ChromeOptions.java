package Day6_04222024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_ChromeOptions {
    public static void main(String[] args) {
        //declare and defin chrome options
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");

        //run headless mode (code runs in the background)
        options.addArguments("headless");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);

        //go to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");
    }
}
