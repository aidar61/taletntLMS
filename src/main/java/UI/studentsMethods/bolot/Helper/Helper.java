package UI.studentsMethods.bolot.Helper;

import UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {
    public Helper waitElementToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public Helper waitElementToBeVisible(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public Helper waitElementToBeClickableAndVisible(WebElement element) {
        waitElementToBeClickable(element).waitElementToBeVisible(element);
        return this;
    }
    public Helper click(WebElement element) {
        waitElementToBeClickableAndVisible(element);
        element.click();
        return this;
    }

    public Helper sendKeys(WebElement element, String str) {
        element.sendKeys(str);
        return this;
    }

    public String getAttributeByValue(WebElement element, String str) {
       return element.getAttribute(str);

    }
}
