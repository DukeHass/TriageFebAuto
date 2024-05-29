package Day11_05072024;

import Day13_05142024.TestParent;
import org.openqa.selenium.WebDriver;

import static Day11_05072024.ReusableMethods.setupChromeDriver;

public class T2_GoogleReusable extends TestParent {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver variable and set up the chrome driver
        WebDriver driver = setupChromeDriver();
        //go to google.com
        driver.navigate().to("https://www.google.com");
        //send keys from reusable methods
        ReusableMethods ReusableMethods;
        Day11_05072024.ReusableMethods.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //submit using reusable methods
        Day11_05072024.ReusableMethods.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
        // click on the tools button
        Day11_05072024.ReusableMethods.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String searchResult = Day11_05072024.ReusableMethods.captureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        //print out the result stats
        System.out.println("Search Result is " + searchResult);
        //quit the chrome browser
        driver.quit();
    }//end of main
}//end of class
