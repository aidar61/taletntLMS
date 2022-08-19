package UI.stepDefinitions.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserEsenStepDef extends EsensBasePage{
    @When("admin click on add notifications buttons")
    public void admin_click_on_add_notifications_buttons() {
       homePage.clickOnAddNotificationButton();
       
    }
    @Then("user input all field")
    public void user_input_all_field() {
        addNotifications.inputName("Esen");
        addNotifications.selectEvent(esensMockDataGenerator.GenerateNumberFrom1To33());
        addNotifications.selectReceiverField(esensMockDataGenerator.GenerateNumberFrom1To4());
        addNotifications.fillBodyOfMessage(esensMockDataGenerator.nameGenerator());
        try{
            addNotifications.inputDefineHour(esensMockDataGenerator.GenerateNumberFrom1To33());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

       
       

    @Then("user click on Create notification button")
    public void user_click_on_create_notification_button() {
       addNotifications.clickAddNotificationButton();
//       notificationsPage.assertMessage();


    }
}
