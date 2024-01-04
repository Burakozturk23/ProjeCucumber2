package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PurchasePage extends Parent{
    public PurchasePage(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//a[contains(text(),'Hero Hoodie')]")
    private WebElement addProduct;
    @FindBy(id = "option-label-size-143-item-167")
    private WebElement size;
    @FindBy(id = "option-label-color-93-item-52")
    private WebElement color;
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])")
    private WebElement addToCart;
    @FindBy(xpath = "(//a[contains(text(),'shopping cart')])")
    private WebElement shoppingCart;
    @FindBy(xpath = "(//span[contains(text(),'Proceed to Checkout')])")
    private WebElement proceedCheckout;
    @FindBy(xpath = "(//span[contains(text(),'Next')])")
    private WebElement next;
    @FindBy(xpath = "(//span[contains(text(),'Place Order')])")
    private WebElement placeOrder;
    @FindBy(xpath = "(//span[contains(text(),'Thank you for your purchase!')])")
    private WebElement orderMessage;




    WebElement myElement;
    public void findAndClick(String strElement) {
        switch (strElement) {
            case "addProduct": myElement = addProduct;break;
            case "size": myElement = size;break;
            case "color": myElement = color;break;
            case "addToCart": myElement = addToCart;break;
            case "shoppingCart": myElement = shoppingCart;break;
            case "proceedCheckout": myElement = proceedCheckout;break;
            case "next": myElement = next;break;
            case "placeOrder": myElement = placeOrder;break;
        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement,String text) {
        switch (strElement) {
            case "orderMessage":myElement=orderMessage;break;
        }
        verifyContainsText(myElement, text);

    }
    public void waituntilLoading(){
        WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='opc-block-summary']"), 0));
    }
}
