package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseAction {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //ass option to start it maximized and incognito
        options.addArguments("start-maximized", "incognito");
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgatge calculator site
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(2000);
        // define Action command
        Actions mouseAction = new Actions(driver);
        //hover over the Send Tab to open up the dropdown list
        try{
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
            mouseAction.moveToElement(sendTab).perform();
        }catch(Exception e){
            System.out.println("Unable to hover over Send Tab "+e);
        }//end of exception

        //click on look up a zip code from the dropdown list
        try{
            WebElement zipCodeLookUp = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookUp).click().perform();
        }catch (Exception e){
            System.out.println("Unable to click on Look up a zip code");
        }//end of exception


        //click on find cities by zipcode from the dropdown list
        try{
            WebElement findcitiesbyzipcode = driver.findElement(By.xpath("//*[text()='Find Cities by ZIP']"));
            mouseAction.moveToElement(findcitiesbyzipcode).click().perform();
        }catch (Exception e){
            System.out.println("Unable to click on Find Cities by ZIP code");
        }//end of exception

        try{
            WebElement enterzipcode = driver.findElement(By.xpath("//*[@id='tZip']"));
            mouseAction.moveToElement(enterzipcode).click().perform();
            mouseAction.moveToElement(enterzipcode).sendKeys("19713").perform();

        }catch (Exception e){
            System.out.println("Unable to enter ZIP code");
        }//end of exception




    }//end of java class
}//end of main method
