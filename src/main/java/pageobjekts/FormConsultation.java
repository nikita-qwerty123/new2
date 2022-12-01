package pageobjekts;
import data.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FormConsultation {
    @FindBy(id = "firstName")
    WebElement name;
    @FindBy(id = "userEmail")
    WebElement Email;
    @FindBy(id = "userNumber")
    WebElement Mobile;
    @FindBy(id = "subjectsInput")
    WebElement Subjects;

    public void completeForm(User user) {
        this.name.sendKeys(user.getName());
        this.Email.sendKeys(user.getEmail());
        this.Mobile.sendKeys(user.getMobile());
        this.Subjects.sendKeys(user.getSubjects());

    }





}
