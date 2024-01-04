package StepDefinitions;

import Pages.MyAccountPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_MyAccountStep {
    MyAccountPage mp=new MyAccountPage();

    @And("Enter the MyAccount Page")
    public void enterTheMyAccountPage() {
        mp.findAndClick("switchButton");
        mp.findAndClick("myAccountButton");
        mp.findAndClick("manageAddress");
        mp.findAndClick("addnewaddress");
    }


    @And("I add a new address with the following details:")
    public void iAddANewAddressWithTheFollowingDetails(DataTable elements) {
        List<List<String>> listelements = elements.asLists(String.class);
        for (int i = 0; i < listelements.size(); i++) {
            mp.findAndSend(listelements.get(i).get(0),listelements.get(i).get(1));

        }



    }
}

