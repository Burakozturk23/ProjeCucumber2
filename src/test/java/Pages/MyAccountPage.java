package Pages;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Parent{
    public MyAccountPage(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "(//button[@class='action switch'])[1]")
    private WebElement switchButton;
    @FindBy(xpath = "(//a[contains(text(),'My Account')])[1]")
    private WebElement myAccountButton;
    @FindBy(xpath = "(//span[contains(text(),'Manage Addresses')])[1]")
    private WebElement manageAddress;
    @FindBy(xpath = "(//span[contains(text(),'Add New Address')])[1]")
    private WebElement addnewaddress;

    @FindBy(id = "telephone")
    private WebElement phoneNumber;
    @FindBy(id = "street_1")
    private WebElement streetAddress;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(id = "region_id")
    private WebElement regionId;
    @FindBy(id = "zip")
    private WebElement zip;
    @FindBy(id = "country")
    private WebElement country;
    @FindBy(xpath = "//div[contains(text(),'You saved the address.')]")
    private WebElement successMessage3;

    WebElement myElement;
    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "phoneNumber":myElement=phoneNumber;break;
            case "streetAddress":myElement=streetAddress;break;
            case "city":myElement=city;break;
            case "zip":myElement=zip;break;
        }
        sendKeysFunction(myElement,value);
    }
    public void findAndClick(String strElement){
        switch (strElement){
            case "switchButton":myElement=switchButton;break;
            case "myAccountButton":myElement=myAccountButton;break;
            case "manageAddress":myElement=manageAddress;break;
            case "addnewaddress":myElement=addnewaddress;break;
            case "regionId":myElement=regionId;break;
            case "country":myElement=country;break;

        }
        clickFunction(myElement);

    }
    public void findAndContainsText(String strElement,String text) {
        switch (strElement) {
            case "successMessage3":myElement=successMessage3;break;
        }
        verifyContainsText(myElement, text);

    }








}
