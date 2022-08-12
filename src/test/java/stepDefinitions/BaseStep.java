package stepDefinitions;

import UI.testPage.LoginPage;
import UI.testPage.addUserTestAidar.AddUser;

public class BaseStep {
    protected AddUser addUser = new AddUser();
    protected LoginPage loginPage = new LoginPage();
}
