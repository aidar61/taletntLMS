package API.stepDefinitions.Esen;

import API.pojo.esen.UserEsen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class EsensStepDefs {
    UserEsen userEsen = new UserEsen();
    @Given("perform method GET to get user by user name")
    public void perform_method_get_to_get_user_by_user_name() {
        System.out.println( userEsen.getUserByUserName2());
    }
    @Then("status code {int} is returned")
    public void status_code_is_returned(Integer int1) {
        MatcherAssert.assertThat( userEsen.checkStatusCode(),Matchers.is(int1));

    }

}
