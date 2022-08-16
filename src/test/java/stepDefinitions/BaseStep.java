package stepDefinitions;

import UI.testPage.LoginPage;
import UI.testPage.addUserTestAidar.AddUser;
import UI.testPage.goToNavBarMenuTestYRYSBEK.HomePageYRYSBEK;

public class BaseStep {
    protected AddUser addUser = new AddUser();
    protected LoginPage loginPage = new LoginPage();
    protected HomePageYRYSBEK homePageYRYSBEK= new HomePageYRYSBEK();
}
