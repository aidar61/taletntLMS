package API.stepDefinitions.Esen;

import API.pojo.esen.UserEsen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class EsensStepDefsToGetUsersStatus {
    UserEsen userEsen = new UserEsen();

    @Given("perform method GET to get users status by user id")
    public void perform_method_get_to_get_users_status_by_user_id() {
        userEsen.getUsersStatusByID();

    }


    @Then("status code {int} is returned1")
    public void status_code_is_returned1(Integer int1) {
        MatcherAssert.assertThat( userEsen.checkStatusCode2(), Matchers.is(int1));
    }


    @Then("user status is online")
    public void user_status_is_online() {
        System.out.println(userEsen.isUserOnline());



    }

    @Given("perform method POST to delete user")
    public void perform_method_post_to_delete_user() {
        userEsen.deleteUser36();
    }
}
