package stepDefinitions.steps;

import UI.dataProviders.ConfigReader;
import UI.studentsMethods.bolot.PageObject.AddCoursePage;
import UI.studentsMethods.bolot.PageObject.BasePage;
import UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.remote.html5.AddApplicationCache;

public class AddCoursesTabStepDefs extends BasePage {
    AddCoursePage addCoursePage = new AddCoursePage();

    @Given("user is on Home page TalentLMS")
    public void user_is_on_home_page_talent_lms() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
        addCoursePage.inputUserNameOrEmail("aidar3107").inputPassword("Aidar548889").clickSubmitButton();
    }

    @When("ser clicks on Add course button")
    public void ser_clicks_on_add_course_button() {
        addCoursePage.clickAddCourseButton();

    }

    @Then("user should see courses credentials")
    public void user_should_see_courses_credentials() {

    }
    @When("user writes course credentialse and clicks on save and select user button")
    public void user_writes_course_credentialse_and_clicks_on_save_and_select_user_button() throws InterruptedException {
        addCoursePage.coursNameInput().categoryInput().inputDescription().inputCourseCode().inputCoursePrice().inputVideo().inputCapacity().timeOptionsInput()
                .certificationSelect().levelSelect().saveAndSelectUs();
        Thread.sleep(10000);
    }
    @Then("user navigate on user page to add them in course")
    public void user_navigate_on_user_page_to_add_them_in_course() {
        addCoursePage.clickGoToCourseButton();
    }

    @When("user clicks on courseButton")
    public void user_clicks_on_course_button() {
        addCoursePage.clickGoToCourseButton();

    }

    @Then("user navigate back to add course page")
    public void user_navigate_back_to_add_course_page() {
        Assertions.assertEquals(addCoursePage.constantCourseName.toString(), addCoursePage.GetAttributeByValue());
        System.out.println(addCoursePage.GetAttributeByValue().toString());

    }

    @When("user clicks on submitButton")
    public void user_clicks_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user navigate to Courses page")
    public void user_navigate_to_courses_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
