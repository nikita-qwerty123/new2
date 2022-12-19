package Pages;

import configuretions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoBasePage  {
    @FindBy (xpath = "//span[@class='course-descriptor_header-text']")
    WebElement Title;
    @FindBy (xpath = "//span[@class='course-rating_average']")
    WebElement Rate;
    @FindBy (xpath = "//div[contains(@class, 'introduction-info_content')]/p")
    WebElement Description;
    @FindBy (xpath = "//div[@class='introduction-info-redactor_section']/ul")
    WebElement Goals;

    public String getCourseTitle() {return Title.getText();}
    public String getCourseRate() {return Rate.getText();}
    public String getCourseDescription() {return Description.getText();}
    public String getCourseGoals() {return Goals.getText();}





}
