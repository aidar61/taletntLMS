package UI.pagesPOM.addNotificationsEsen;

import UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends EsensBasePage {

    @FindBy(xpath = "//a[@href='https://aidar.talentlms.com/eventsengine/notification_create']")
    public WebElement addNotifications;

    @FindBy(xpath = "")
    public WebElement eventsEngine;


    public HomePage clickOnAddNotificationButton(){
        esensMethods.click(addNotifications);
        return this;
    }
    public HomePage clickOnEventsEngineButton(){
        esensMethods.click(eventsEngine);
        return this;
    }
}
