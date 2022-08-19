package UI.pagesPOM.addNotificationsEsen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNotifications extends EsensBasePage {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInputField;
    @FindBy(xpath = "//select[@name='event_type']")
    public WebElement selectEventField;
    @FindBy(xpath = "//select[@name='event_receiver']")
    public WebElement selectReceiverField;
    @FindBy(xpath = "//textarea [@name='notification_content']")
    public WebElement bodyOfMessage;
    @FindBy(xpath = "//input[@name='hours']")
    public WebElement defineHoursField;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement addNotificationButton;

    public AddNotifications clickAddNotificationButton(){
        esensMethods.click(addNotificationButton);
        return this;
    }

    public AddNotifications inputName(String name) {
        esensMethods.sendKeys(nameInputField, name);
        return this;
    }
    public AddNotifications inputDefineHour (int hour){
        esensMethods.sendKeys(defineHoursField, String.valueOf(hour));
        return this;
    }

    public AddNotifications selectEvent(int number) {
        esensMethods.selectDropDownMenu(selectEventField, number);
        return this;
    }

    public AddNotifications selectReceiverField(int number) {
        esensMethods.selectDropDownMenu(selectReceiverField, number);
        return this;
    }

    public AddNotifications fillBodyOfMessage(String someText) {
        esensMethods.sendKeys(bodyOfMessage, someText);

        return this;
    }
}
