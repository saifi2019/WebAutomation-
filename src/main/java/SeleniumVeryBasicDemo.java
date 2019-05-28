import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumVeryBasicDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Saif/Desktop/automationFramework/WebAutomation/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("iPhone");
        driver.findElement(By.name("submit_search")).click();
        driver.close();

    }
}
