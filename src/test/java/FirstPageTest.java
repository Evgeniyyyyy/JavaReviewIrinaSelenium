import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ybozhenko/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.close();
    }
}
