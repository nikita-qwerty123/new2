package tests;

import Pages.AutoBasePage;
import configuretions.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class HillelAutoTest extends BaseClass {
 static final String mainURL="https://ithillel.ua/courses/qa-automation";
 static AutoBasePage qaAuto= PageFactory.initElements(driver,AutoBasePage.class);


 @Before
 public void before() {
  if (!driver.getCurrentUrl().equals(mainURL)) {
   driver.get("https://ithillel.ua/courses/qa-automation");
  }

 }

  @Test
  public void HillelAutoTest() {
   System.out.println(qaAuto.getCourseTitle());
   System.out.println();
   System.out.println(qaAuto.getCourseGoals());
   System.out.println();
   System.out.println(qaAuto.getCourseRate());
   System.out.println();
   System.out.println(qaAuto.getCourseDescription());


  }

}
