package UI.stepDefinitions;

import UI.pagesPOM.LoginPage;
import UI.pagesPOM.addUserTestAidar.AddUser;
import UI.pagesPOM.goToNavBarMenuTestYRYSBEK.HomePageYRYSBEK;


public class BaseStep {
    protected AddUser addUser = new AddUser();
    protected LoginPage loginPage = new LoginPage();
    protected HomePageYRYSBEK homePageYRYSBEK= new HomePageYRYSBEK();
}
