package stepDefinitions.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefinitions.BaseStep;

public class UserASANStepsDef extends BaseStep {
    @When("Admin click on Users div button")
    public void admin_click_on_users_div_button() {
        addUser.adminClickOnUserButton();
        throw new io.cucumber.java.PendingException();
    }
    @Then("Admin should see {string} header text")
    public void admin_should_see_header_text(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
