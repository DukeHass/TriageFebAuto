package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class inClassActionItem_Statefarm {
    public static void main(String[] args) throws InterruptedException {
        //select start month from the dropdown on mortgagecalculator.org
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgatge calculator site
        driver.navigate().to("https://www.statefarm.com");
        Thread.sleep(2000);

        //click on Get a Quote
        driver.findElement(By.xpath("//*[text()='Get a Quote']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@name='productName']")).click();

        driver.findElement(By.xpath("//*[@value='Homeowners']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@name='zipCode']")).sendKeys("11210");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Start a quote']")).click();

        WebElement startDate = driver.findElement(By.xpath("//*[@id='firstName']"));
        startDate.click();
        startDate.clear();
        startDate.sendKeys("10/12/2024");


    }
}
