package UI.testPage.addNotifications;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationsPage extends EsensBasePage{
    @FindBy(xpath = "//div[class='toast-message']")
    public WebElement successMessage;

    public void assertText(String expected, WebElement actual){
        esensMethods.waitElementToBeVisible(actual);
        assertEquals(  expected, actual.getText());


    }

//    public NotificationsPage assertMessage() {
//        assertText();
//
//    }




}
