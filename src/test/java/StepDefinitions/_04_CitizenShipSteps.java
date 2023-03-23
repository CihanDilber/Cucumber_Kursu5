package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenShipSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to citizenship page")
    public void navigateToCitizenshipPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.citizenships);
    }

    @When("User create a Citizenship name as {string} and short name as {string}")
    public void userCreateACitizenshipNameAsAndShortNameAs(String name, String shortname) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortName,shortname);
        dc.clickFunction(dc.saveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExist,"already");
    }
}
