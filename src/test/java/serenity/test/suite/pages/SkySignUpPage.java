package serenity.test.suite.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
//import net.serenitybdd.core.annotations.findby.FindBy;
//import net.thucydides.core.annotations.Managed;
//import org.openqa.selenium.WebDriver;


@DefaultUrl("https://skyid.sky.com/signup/skycom")
public class SkySignUpPage extends PageObject {


    public void getElementIds(String ElementVal, String inputValue)
    {
        $(ElementVal).sendKeys(inputValue);
    }

    public void clickElement(String ElementVal)
    {
        $(ElementVal).click();
    }

}
