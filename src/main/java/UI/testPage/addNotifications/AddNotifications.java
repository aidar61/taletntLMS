package UI.testPage.addNotifications;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNotifications extends EsensBasePage{

@FindBy (xpath = "//input[@name='name']")
    public WebElement nameInputField;
@FindBy(xpath = "//select[@name='event_type']")
    public WebElement selectEventField;
@FindBy(xpath = "//select[@name='event_receiver']")
    public WebElement selectReceiverField;


public AddNotifications inputName (){
    esensMethods.sendKeys(nameInputField,esensMockDataGenerator.nameGenerator());
    return this;
}

public AddNotifications selectEvent(){
    esensMethods.selectDropDownMenu(selectEventField, esensMockDataGenerator.GenerateNumberFrom1To33());
    return this;
}
public AddNotifications selectReceiverField(){
    esensMethods.selectDropDownMenu(selectReceiverField,esensMockDataGenerator.GenerateNumberFrom1To4());
    return this;
}
}
