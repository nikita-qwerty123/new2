package configuretions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver;

    @BeforeClass
    public static void createDriver() {
        driver = DriverConfig.create(BROWSERS.CHROMEWITHPROXY);
    }
    @AfterClass
    public static void after(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
