package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T2_cLICKdROPDOWN {
    public static void main(String[] args) throws InterruptedException {
        //select start month from the dropdown on mortgagecalculator.org
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgatge calculator site
        driver.navigate().to("https://www.mortgagecalculator.org/");
        Thread.sleep(2000);
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeValue.clear();
        homeValue.sendKeys("950000");
        driver.findElement(By.xpath("//*[@id='downpayment']")).sendKeys("100000");
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();

        //driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();
        driver.findElement(By.xpath("//*[text()='Dec']")).click();
        //driver.findElement(By.xpath("//*[text()='May']")).click();

    }
}
