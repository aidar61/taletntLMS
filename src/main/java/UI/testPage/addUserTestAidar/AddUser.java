package UI.testPage.addUserTestAidar;

import UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser extends BasePage{
    public AddUser() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "xpath")
    WebElement element;

    public void adminClickOnUserButton() {
        methods.click(element);
    }
}
