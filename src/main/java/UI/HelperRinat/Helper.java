package UI.HelperRinat;

import UI.utils.Driver;
import org.apache.commons.lang.ObjectUtils;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {

    public Helper waitElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public Helper waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public Helper click(WebElement element){
        waitElementToBeDisplayed(element).waitElementToBeClickable(element);
        element.click();
        return this;
    }
    public Helper pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }
    public Helper sendKeys(WebElement element,String str){
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }

    public Helper backSpace(WebElement element) {
        for (int i = 0; i < 10; i++) {
           element.sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }



}
