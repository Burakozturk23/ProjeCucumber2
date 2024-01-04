package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Parent{

    public RegisterPage(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    private WebElement registerButton;
    @FindBy(id = "firstname")
    private WebElement firstName;
    @FindBy(id = "lastname")
    private WebElement lastName;
    @FindBy(id = "email_address")
    private WebElement email;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "password-confirmation")
    private WebElement confirm;
    @FindBy(xpath = "//div[contains(text(),' registering with Main Website Store.')]")
    private WebElement successMessage;
    @FindBy(xpath = "//span[contains(text(),'Create an Account')]")
    private WebElement createButton;





    WebElement myElement;

    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "firstName":myElement=firstName;break;
            case "lastName":myElement=lastName;break;
            case "email":myElement=email;break;
            case "password":myElement=password;break;
            case "confirm":myElement=confirm;break;






        }
        sendKeysFunction(myElement,value);

    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "registerButton":myElement=registerButton;break;
            case "createButton":myElement=createButton;break;





        }
        clickFunction(myElement);

    }
    public void findAndContainsText(String strElement,String text) {
        switch (strElement) {
            case "successMessage":myElement=successMessage;break;

        }
        verifyContainsText(myElement, text);

    }
}
