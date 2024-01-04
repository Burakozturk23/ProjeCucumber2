package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Parent{
    public LoginPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    private WebElement signinButton;

    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "pass")
    private WebElement password;
    @FindBy(id = "send2")
    private WebElement signButton2;
    @FindBy(xpath = "//span[contains(text(), 'Welcome')]")
    private WebElement successMessage2;

    //span[contains(text(), 'Welcome')]

    WebElement myElement;
    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "email":myElement=email;break;
            case "password":myElement=password;break;
        }
        sendKeysFunction(myElement,value);
    }
    public void findAndClick(String strElement){
        switch (strElement){
            case "signinButton":myElement=signinButton;break;
            case "signButton2":myElement=signButton2;break;
        }
        clickFunction(myElement);

    }
    public void findAndContainsText(String strElement,String text) {
        switch (strElement) {
            case "successMessage2":myElement=successMessage2;break;
        }
        verifyContainsText(myElement, text);

    }



}
