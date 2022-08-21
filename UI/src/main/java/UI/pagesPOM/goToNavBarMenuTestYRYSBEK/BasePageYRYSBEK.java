package UI.pagesPOM.goToNavBarMenuTestYRYSBEK;

import UI.studentsMethods.yrysbek.HelperMethodsYRYSBEK;
import UI.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePageYRYSBEK {

    public BasePageYRYSBEK() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    HelperMethodsYRYSBEK helper = new HelperMethodsYRYSBEK();

}
