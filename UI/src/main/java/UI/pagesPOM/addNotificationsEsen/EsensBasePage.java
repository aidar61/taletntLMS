package UI.pagesPOM.addNotificationsEsen;

import UI.dataProviders.EsensMockDataGenerator;
import UI.studentsMethods.Esen.EsensJavaScriptExecutor;
import UI.studentsMethods.Esen.EsensMethods;
import UI.studentsMethods.Esen.EsensTableMethods;
import UI.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class EsensBasePage {
    EsensMockDataGenerator esensMockDataGenerator = new EsensMockDataGenerator();
    EsensTableMethods tableMethods = new EsensTableMethods();
    EsensMethods esensMethods = new EsensMethods();
    EsensJavaScriptExecutor esensJavaScriptExecutor = new EsensJavaScriptExecutor();
    public EsensBasePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
