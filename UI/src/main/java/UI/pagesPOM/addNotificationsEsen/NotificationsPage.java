package UI.pagesPOM.addNotificationsEsen;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationsPage extends EsensBasePage {
    @FindBy(xpath = "//div[class='toast-message']")
    public WebElement successMessage;

    @FindBy(xpath = "//table[@id='tl-notifications-grid']")
    public WebElement tableOfNotifications;
    @FindBy(xpath = "//i[@class=\"icon-remove icon-grid\"]")
    public WebElement removeButtons;
    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchByNameField;
    @FindBy(xpath = "(//a[@class='btn btn-danger'])[1]")
    public WebElement clearNotificationButton;
    @FindBy(xpath = "//a[@href=\"https://aidar.talentlms.com/eventsengine/notification_history\"]")
    public WebElement historyNotificationsButton;
    @FindBy(xpath = "//a[@href=\"https://aidar.talentlms.com/eventsengine/notification_pending\"]")
    public WebElement pendingNotificationsButton;

    public NotificationsPage clickOnPendingNotifications(){
        esensMethods.click(pendingNotificationsButton);
        return this;
    }

    public NotificationsPage clickOnHistoryButton() {

        esensMethods.click(historyNotificationsButton);
        return this;
    }

    public NotificationsPage deleteNotificationByJS() {
        esensJavaScriptExecutor.jsClick(removeButtons);
        return this;
    }

    public NotificationsPage inputNameInSearchField(String name) {
        esensMethods.sendKeys(searchByNameField, name);
        return this;

    }

    public void assertText(String expected, WebElement actual) {
        esensMethods.waitElementToBeVisible(actual);
        assertEquals(expected, actual.getText());
    }

    public void assertTextClearNot(String expected) {
        esensMethods.waitElementToBeVisible(clearNotificationButton);
        assertEquals(expected, clearNotificationButton.getText());
    }


    public NotificationsPage assertMessage() {
        assertText("Success! New notification created", successMessage);
        return this;
    }


}
