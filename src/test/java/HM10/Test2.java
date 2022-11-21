package HM10;

import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends BaseClass {
    public static void main(String[] args) {
        BaseClass.createDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        enterContactForm();
        driver.quit();




    }

    private static void enterContactForm() {
        User user = new User();
        By inputNameLocator = By.id("firstName");
        By inputEmailLocator = By.id("userEmail");
        By inputMobileLocator = By.id("userNumber");
        By inputSubjects = By.id("subjectsInput");
        driver.findElement(inputNameLocator).sendKeys(user.getName());
        driver.findElement(inputEmailLocator).sendKeys(user.getEmail());
        driver.findElement(inputMobileLocator).sendKeys(user.getMobile());
        driver.findElement(inputSubjects).sendKeys(user.getSubjects());






    }
}
