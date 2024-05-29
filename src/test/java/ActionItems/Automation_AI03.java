package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_AI03 {
    public static void main(String[] args) throws InterruptedException {

        //define the webdriver variable
        WebDriver driver = new ChromeDriver();

        //navigate to google page
        driver.navigate().to("https://www.bing.com/");
        driver.manage().window().maximize();
        //wait for 3 seconds
        Thread.sleep(10000);
        //typing in words in search bar
        driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys("cars");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='search_icon']")).click();


        //wait for 3 seconds
        Thread.sleep(3000);
        String searchResult = driver.findElement(By.xpath("//*[@id='b_tween_searchResults']")).getText();
        System.out.println("search result is " + searchResult);
        //splitting Array declare
        String[] splitmsgArray = searchResult.split(" ");

        //print out only the number from the string
        System.out.println("total number of serach result is "+splitmsgArray[1]);

        //clicking on More button
        driver.findElement(By.xpath("//*[@id='b_sp_menu_separ']")).click();
        Thread.sleep(2000);
        //clicking on My Bing button from the dropdown
        driver.findElement(By.xpath("//*[@id=\"b-scopeListItem-bingpages\"]/a")).click();
        Thread.sleep(2000);

        //capturing and printing the Message
        String myProfileMessage = driver.findElement(By.xpath("//*[@class='myprofile-see-profile']")).getText();
        System.out.println(myProfileMessage);

        driver.quit();

    }
}

