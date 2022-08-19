package UI.studentsMethods.Esen;

import UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EsensTableMethods {
    public EsensTableMethods clickRowElements(By locator){
        List<WebElement> listOfElements = Driver.getDriver().findElements(locator);
        for (WebElement element :listOfElements){
            element.click();
        }
        return this;
    }
}
