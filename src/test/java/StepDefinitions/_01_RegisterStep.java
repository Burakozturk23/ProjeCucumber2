package StepDefinitions;

import Pages.LoginPage;
import Pages.RegisterPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _01_RegisterStep {
    RegisterPage rp=new RegisterPage();
    LoginPage lp=new LoginPage();

    @Given("Navigate to bank")
    public void navigateToBank() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        GWD.getDriver().manage().window().maximize();

    }


    @When("Click on the element in the RegisterPage")
    public void clickOnTheElementInTheRegisterPage(DataTable elements) {
        List<String> listelements = elements.asList(String.class);
        for (int i = 0; i < listelements.size(); i++) {
            rp.findAndClick(listelements.get(i));
        }
        
    }

    @Then("User sending  the keys in RegisterPage")
    public void userSendingTheKeysInRegisterPage(DataTable elements) {
        List<List<String>> listelements = elements.asLists(String.class);
        for (int i = 0; i < listelements.size(); i++) {
            rp.findAndSend(listelements.get(i).get(0),listelements.get(i).get(1));
        }
        
    }


    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
       // rp.findAndContainsText("successMessage","Thank you for registering with Main Website Store.");
        lp.findAndContainsText("successMessage2","Welcome,");

    }
}
