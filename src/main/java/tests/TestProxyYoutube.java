package tests;

import configuretions.BaseProxy;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import util.Screen;


public class TestProxyYoutube extends BaseProxy {
    @BeforeClass
   public static void openPage(){
        driver.get("https://www.youtube.com/");
    }
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("No war");
       driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Screen.takeScreen(driver,"Screen");




    }

}
