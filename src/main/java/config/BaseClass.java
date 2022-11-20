package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
   public static WebDriver driver;
    public static void createDriver(){
        if (driver == null) {
            driver = new ChromeDriver();
        }

    }
}
