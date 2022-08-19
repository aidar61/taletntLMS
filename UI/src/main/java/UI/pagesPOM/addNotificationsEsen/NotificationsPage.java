package UI.pagesPOM.addNotificationsEsen;

import io.cucumber.java.mk_latn.No;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationsPage extends EsensBasePage{
    @FindBy(xpath = "//div[class='toast-message']")
    public WebElement successMessage;

    @FindBy (xpath = "//table[@id='tl-notifications-grid']")
    public WebElement tableOfNotifications;
    @FindBy(xpath = "//i[@class=\"icon-remove icon-grid\"]")
    public WebElement removeButtons;

    public void assertText(String expected, WebElement actual){
        esensMethods.waitElementToBeVisible(actual);
        assertEquals(  expected, actual.getText());


    }

    public NotificationsPage assertMessage() {
        assertText("Success! New notification created",successMessage);
        return this;
    }

//    public NotificationsPage






}
