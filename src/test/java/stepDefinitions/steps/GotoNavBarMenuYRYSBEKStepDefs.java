package stepDefinitions.steps;

import UI.dataProviders.ConfigReader;
import UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static UI.utils.Driver.driver;
import static org.junit.jupiter.api.Assertions.*;
import stepDefinitions.BaseStep;

public class GotoNavBarMenuYRYSBEKStepDefs extends BaseStep {

    @Given("admin logins into the system")
    public void admin_logins_into_the_system() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
        loginPage.loginToSystem();
    }
    @When("admin hovers on GoTo button from NavBar menu")
    public void admin_hovers_on_go_to_button_from_nav_bar_menu() {
        homePageYRYSBEK.hoverOnGoToMenu();
    }
    @When("admin clicks on Home button")
    public void admin_clicks_on_home_button() {
       homePageYRYSBEK.clickHomeButton();
    }
    @Then("admin should see Home text as {string}")
    public void admin_should_see_home_text_as(String homeText) {
        assertEquals(homeText, homePageYRYSBEK.getHomeText());
    }
    @When("admin clicks on Users button")
    public void admin_clicks_on_users_button() {
       homePageYRYSBEK.clickUsersButton();
    }
    @Then("admin should see Users text as {string}")
    public void admin_should_see_users_text_as(String usersText) {
        assertEquals(usersText,homePageYRYSBEK.getUsersText());
    }
    @When("admin clicks on Courses button")
    public void admin_clicks_on_courses_button() {
        homePageYRYSBEK.clickCoursesButton();
    }
    @Then("admin should see Courses text as {string}")
    public void admin_should_see_courses_text_as(String coursesText) {
        assertEquals(coursesText, homePageYRYSBEK.getCoursesText());
    }
    @When("admin clicks on Course Store button")
    public void admin_clicks_on_course_store_button() {
        homePageYRYSBEK.clickCourseStoreButton();
    }
    @Then("admin should see Course Store text as {string}")
    public void admin_should_see_course_store_text_as(String courseStoreText) {
        assertEquals(courseStoreText,homePageYRYSBEK.getCourseStoreText());
    }
    @When("admin clicks on Categories button")
    public void admin_clicks_on_categories_button() {
        homePageYRYSBEK.clickCategoriesButton();
    }
    @Then("admin should see Categories text as {string}")
    public void admin_should_see_categories_text_as(String categoriesText) {
        assertEquals(categoriesText,homePageYRYSBEK.getCategoriesText());
    }
    @When("admin clicks on Groups button")
    public void admin_clicks_on_groups_button() {
        homePageYRYSBEK.clickGroupsButton();
    }
    @Then("admin should see Groups text as {string}")
    public void admin_should_see_groups_text_as(String groupsText) {
        assertEquals(groupsText,homePageYRYSBEK.getGroupsText());
    }
    @When("admin clicks on Branches button")
    public void admin_clicks_on_branches_button() {
        homePageYRYSBEK.clickBranchesButton();
    }
    @Then("admin should see Branches text as {string}")
    public void admin_should_see_branches_text_as(String branchesText) {
        assertEquals(branchesText,homePageYRYSBEK.getBranchesText());
    }
    @When("admin clicks on Reports button")
    public void admin_clicks_on_reports_button() {
        homePageYRYSBEK.clickReportsButton();
    }
    @Then("admin should see Reports text as {string}")
    public void admin_should_see_reports_text_as(String reportsText) {
        assertEquals(reportsText,homePageYRYSBEK.getReportsText());
    }
    @When("admin clicks on Import-Export button")
    public void admin_clicks_on_import_export_button() {
        homePageYRYSBEK.clickImportButton();
    }
    @Then("admin should see Import-Export text as {string}")
    public void admin_should_see_import_export_text_as(String importExportText) {
        assertEquals(importExportText,homePageYRYSBEK.getImportExportText());
    }
    @When("admin clicks on Events engine button")
    public void admin_clicks_on_events_engine_button() {
        homePageYRYSBEK.clickEventsButton();
    }
    @Then("admin should see Events engine text as {string}")
    public void admin_should_see_events_engine_text_as(String eventsText) {
        assertEquals(eventsText, homePageYRYSBEK.getEventsText());
    }
    @When("admin clicks on Account & Settings button")
    public void admin_clicks_on_account_settings_button() {
        homePageYRYSBEK.clickAccountSettingsButton();
    }
    @Then("admin should see Account & Settings text as {string}")
    public void admin_should_see_account_settings_text_as(String accountAndSettingsText) {
        assertEquals(accountAndSettingsText,homePageYRYSBEK.getAccountAndSettingsText());
    }
    @When("admin clicks on Add user button")
    public void admin_clicks_on_add_user_button() {
        homePageYRYSBEK.clickAddUserButton();
    }
    @Then("admin should see Add user text as {string}")
    public void admin_should_see_add_user_text_as(String addUserText) {
        assertEquals(addUserText,homePageYRYSBEK.getAddUserText());
    }
    @When("admin clicks on Add course button")
    public void admin_clicks_on_add_course_button() {
        homePageYRYSBEK.clickAddCourseButton();
    }
    @Then("admin should see Add course text as {string}")
    public void admin_should_see_add_course_text_as(String addCourseText) {
        assertEquals(addCourseText,homePageYRYSBEK.getAddCourseText());
        driver.close();
        driver.quit();
    }
}
