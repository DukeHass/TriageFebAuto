package Day5_04162024;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {


        //define the webdriver variable
        WebDriver driver = new ChromeDriver();

        //navigate to google page
        driver.navigate().to("https://www.google.com");
        //maximize the chrome window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).submit();



        //pause the code for 3 seconds
       Thread.sleep(3000);
       String searchResult = driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
        System.out.println("search result is "+searchResult);
        driver.quit();

    }
}
