package Day9_04302024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_Exception {
    public static void main(String[] args) throws InterruptedException {
        //select start month from the dropdown on mortgagecalculator.org
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgatge calculator site
        driver.navigate().to("https://www.mlcalc.com");
        Thread.sleep(2000);


        //enter the purchase price
        try{
            WebElement pPrice = driver.findElement(By.xpath("//*[@id='ma']"));
            pPrice.clear();
            pPrice.sendKeys("350000");
        }catch (Exception e){
            System.out.println("Unable to enter value on Purchase Price: " + e);
        }//end of purchase price exception

        //enter down payment
        try{

            WebElement dPayment = driver.findElement(By.xpath("//*[@id='dp']"));
//            WebElement dPayment = driver.findElement(By.xpath("//*[@id='dpn']"));
            dPayment.clear();
            dPayment.sendKeys("10");
        }catch (Exception e){
            System.out.println("Unable to enter value on Down Payment: " + e);
        }//end of down payment exception

        //click on Show advanced options
        try{
            driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();
        }catch (Exception e){
            System.out.println("Unable to click on Show advanced options: " + e);
        }//end of Show advanced options exception
//select June from the start month dropdown
        try{
            WebElement strMonth = driver.findElement(By.xpath("//*[@name='sm']"));
            Select dropdown = new Select(strMonth);
            dropdown.selectByVisibleText("Jun");
        }catch (Exception e){
            System.out.println("Unable to select a value from Start Month dropdown " + e);
        }//end of start month drop down exception
    }
}
