package UI.studentsMethods.yrysbek;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import UI.utils.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static UI.utils.Driver.driver;

public class HelperMethodsYRYSBEK {

    public HelperMethodsYRYSBEK waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public HelperMethodsYRYSBEK waitElementToBeClickAble(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public HelperMethodsYRYSBEK click(WebElement element) {
        waitElementToBeDisplayed(element).waitElementToBeClickAble(element);
        element.click();
        return this;
    }

    public HelperMethodsYRYSBEK hover(WebElement element) {
        waitElementToBeDisplayed(element).waitElementToBeClickAble(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        return this;
    }

    public HelperMethodsYRYSBEK pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public HelperMethodsYRYSBEK sendKeys(WebElement element, String str) {
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }

    public HelperMethodsYRYSBEK sendKeysWithClear(WebElement element, String str) {
        waitElementToBeDisplayed(element);
        element.clear();
        element.sendKeys(str);
        return this;
    }

    public String getAttributeByValue(WebElement element) {
        waitElementToBeDisplayed(element);
        return element.getAttribute("value");
    }

    public String getText(WebElement element) {
        waitElementToBeDisplayed(element);
        return element.getText();
    }

    public HelperMethodsYRYSBEK selectFromDropDown(WebElement element, String str) {
        waitElementToBeDisplayed(element);
        Select select = new Select(element);
        select.selectByVisibleText(str);
        return this;
    }
}
