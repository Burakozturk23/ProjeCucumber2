package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginStep {

    LoginPage lp=new LoginPage();


    @When("Click on the element in the LoginPage")
    public void clickOnTheElementInTheLoginPage() {
        lp.findAndClick("signinButton");
    }

    @Then("Enter email and password and click signin button")
    public void enterEmailAndPasswordAndClickSigninButton() {
        lp.findAndSend("email","burak23@domain.com");
        lp.findAndSend("password","Burak.123");
        lp.findAndClick("signButton2");
    }
}
