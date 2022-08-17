package UI.studentsMethods.bolot.Helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {

    public DropDownHelper clickElementByVisibilityText(WebElement element, String visibilityText){
        Select select = new Select(element);
        select.selectByVisibleText(visibilityText);
        return this;
    }
    public DropDownHelper clickELementByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
        return this;
    }

    public DropDownHelper clickElementByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
        return this;
    }

}
