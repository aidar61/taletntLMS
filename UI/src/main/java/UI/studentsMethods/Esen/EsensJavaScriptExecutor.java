package UI.studentsMethods.Esen;

import UI.dataProviders.ConfigReader;
import UI.utils.ChromeWebDriver;
import UI.utils.Driver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EsensJavaScriptExecutor {



    public static void jsClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click",element);
    }




}
