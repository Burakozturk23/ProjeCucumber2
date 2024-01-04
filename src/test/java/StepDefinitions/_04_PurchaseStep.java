package StepDefinitions;

import Pages.PurchasePage;
import io.cucumber.java.en.And;

public class _04_PurchaseStep {
    PurchasePage pp=new PurchasePage();


    @And("Select a product")
    public void selectAProduct() {
        pp.findAndClick("addProduct");
        pp.findAndClick("size");
        pp.findAndClick("color");
    }

    @And("Add to Cart and click Shopping Cart")
    public void addToCartAndClickShoppingCart() {
        pp.findAndClick("addToCart");
        pp.findAndClick("shoppingCart");
    }

    @And("Proceed to Checkout")
    public void proceedToCheckout() {
        pp.findAndClick("proceedCheckout");
        pp.findAndClick("next");
        pp.findAndClick("placeOrder");
    }
}
