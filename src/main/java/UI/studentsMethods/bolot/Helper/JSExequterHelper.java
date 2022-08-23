package UI.studentsMethods.bolot.Helper;

import UI.utils.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExequterHelper {


        public static void jsClick(WebElement element){
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click",element);
            Driver.getDriver().close();
        }

    public static void jsScroll(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,5000)", "");
//        js.executeScript("window.location = \'https://www.amazon.com\'");
//        String s = "https://www.amazon.com";
//        String scrpt = "window.location = \'" + s + "\'";
//        js.executeScript(scrpt);
        Driver.getDriver().close();
    }

}
