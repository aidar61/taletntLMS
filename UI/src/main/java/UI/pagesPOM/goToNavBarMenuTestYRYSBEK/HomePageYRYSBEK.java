package UI.pagesPOM.goToNavBarMenuTestYRYSBEK;

import UI.studentsMethods.yrysbek.HelperMethodsYRYSBEK;
import UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageYRYSBEK extends BasePageYRYSBEK {


    public HomePageYRYSBEK() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    HelperMethodsYRYSBEK helper = new HelperMethodsYRYSBEK();

    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']")
    public WebElement goToMenu;

    public HomePageYRYSBEK hoverOnGoToMenu() {
        helper.hover(goToMenu);
        return this;
    }

    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[1]")
    public WebElement homeButton;

    public HomePageYRYSBEK clickHomeButton() {
        helper.click(homeButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement homeText;

    public String getHomeText() {
        return helper.getText(homeText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[2]")
    public WebElement usersButton;

    public HomePageYRYSBEK clickUsersButton() {
        helper.click(usersButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement usersText;

    public String getUsersText() {
        return helper.getText(usersText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[3]")
    public WebElement coursesButton;

    public HomePageYRYSBEK clickCoursesButton() {
        helper.click(coursesButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement coursesText;

    public String getCoursesText() {
        return helper.getText(coursesText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[4]")
    public WebElement courseStoreButton;

    public HomePageYRYSBEK clickCourseStoreButton() {
        helper.click(courseStoreButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement courseStoreText;

    public String getCourseStoreText() {
        return helper.getText(courseStoreText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[5]")
    public WebElement categoriesButton;

    public HomePageYRYSBEK clickCategoriesButton() {
        helper.click(categoriesButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement categoriesText;

    public String getCategoriesText() {
        return helper.getText(categoriesText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[6]")
    public WebElement groupsButton;

    public HomePageYRYSBEK clickGroupsButton() {
        helper.click(groupsButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement groupsText;

    public String getGroupsText() {
        return helper.getText(groupsText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[7]")
    public WebElement branchesButton;

    public HomePageYRYSBEK clickBranchesButton() {
        helper.click(branchesButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement branchesText;

    public String getBranchesText() {
        return helper.getText(branchesText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[8]")
    public WebElement reportsButton;

    public HomePageYRYSBEK clickReportsButton() {
        helper.click(reportsButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement reportsText;

    public String getReportsText() {
        return helper.getText(reportsText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[9]")
    public WebElement importExportButton;

    public HomePageYRYSBEK clickImportButton() {
        helper.click(importExportButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement importExportText;

    public String getImportExportText() {
        return helper.getText(importExportText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[10]")
    public WebElement eventsButton;

    public HomePageYRYSBEK clickEventsButton() {
        helper.click(eventsButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement eventsText;

    public String getEventsText() {
        return helper.getText(eventsText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[11]")
    public WebElement acountAndSettingsButton;

    public HomePageYRYSBEK clickAccountSettingsButton() {
        helper.click(acountAndSettingsButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement accountAndSettingsText;

    public String getAccountAndSettingsText() {
        return helper.getText(accountAndSettingsText);
    }


    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[13]")
    public WebElement addUserButton;

    public HomePageYRYSBEK clickAddUserButton() {
        helper.click(addUserButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement addUserText;

    public String getAddUserText() {
        return helper.getText(addUserText);
    }

    @FindBy(xpath = "//div/ul/li[@id='tl-dropdown-goto']/ul/li[14]")
    public WebElement addCourseButton;

    public HomePageYRYSBEK clickAddCourseButton() {
        helper.click(addCourseButton);
        return this;
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement addCourseText;

    public String getAddCourseText() {
        return helper.getText(addCourseText);
    }
}
