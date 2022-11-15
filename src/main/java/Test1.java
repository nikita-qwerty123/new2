import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/usr/local/Caskroom/chromedriver/107.0.5304.62/chromedriver");
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
