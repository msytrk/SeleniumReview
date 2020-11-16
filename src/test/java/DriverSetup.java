import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

    public static void main(String[] args) {


        // Option_1
        System.setProperty("Driver","/Users/soyturk/IdeaProjects/SeleniumReview/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");




    }






}
