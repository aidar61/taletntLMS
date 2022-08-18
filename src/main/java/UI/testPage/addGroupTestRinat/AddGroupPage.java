package UI.testPage.addGroupTestRinat;

import UI.HelperRinat.Helper;
import UI.utils.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class AddGroupPage extends Helper {
    public AddGroupPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "login")
    public WebElement inputLogin;
    
    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(name = "submit")
    public WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Add group')]")
    public WebElement groupButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputNameText;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement inputDescriptionText;

    @FindBy(id = "show-key")
    public WebElement groupKeyButton;

    @FindBy(xpath = "//input[@name='group_key']")
    public WebElement inputGroupKeyText;

    @FindBy(xpath = "//a[text()='Price']")
    public WebElement priceButton;

    @FindBy(name = "price")
    public WebElement inputPriceAmount;

    @FindBy(name = "submit_group")
    public WebElement submitGroupButton;

    @FindBy(xpath = "(//i[@title='Add to group'])[1]")
    public WebElement addGroupUsersButton1;

    @FindBy(xpath = "//a[contains(text(),'Courses')]")
    public WebElement coursesButton;

    @FindBy(xpath = "(//i[@title='Add to group'])[1]")
    public WebElement getAddGroupCoursesButton1;

    @FindBy(xpath = "(//i[@title='Add to group'])[3]")
    public WebElement getAddGroupCoursesButton3;

    @FindBy(xpath = "(//i[@title='Add to group'])[4]")
    public WebElement getAddGroupCoursesButton4;

    @FindBy(xpath = "(//i[@title='Add to group'])[6]")
    public WebElement getAddGroupCoursesButton6;

    @FindBy(xpath = "//a[@title='Groups']")
    public WebElement groupsPageButton;

    @FindBy(xpath = "(//span[@title='Test'])[1]")
    public WebElement selectGroupButton;

    @FindBy(xpath = "(//a[@class='btn btn-danger'])[1]")
    public WebElement deleteGroupButton;

    @FindBy(id = "//a[@id='tl-confirm-submit']")
    public WebElement deleteGroup;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement homeButton;

    public AddGroupPage loginInput(String login){
        sendKeys(inputLogin,login);
        return this;
    }

    public AddGroupPage passwordInput(String password){
        sendKeys(inputPassword,password);
        return this;
    }

    public AddGroupPage clickLoginButton(){
        loginButton.click();
        return this;
    }

    public AddGroupPage clickButtonGroup(){
        click(groupButton);
        return this;
    }

    public AddGroupPage inputName(String str){
        sendKeys(inputNameText,str);
        return this;
    }

    public AddGroupPage inputDescription(String str){
        sendKeys(inputDescriptionText,str);
        return this;
    }

    public AddGroupPage buttonGroupKey(){
        click(groupKeyButton);

    return this;
    }

    public AddGroupPage clickPriceButton(){
        click(priceButton);
        return this;
    }

    public AddGroupPage amountPriceInput(String sum){
        sendKeys(inputPriceAmount,sum);
        return this;
    }

    public AddGroupPage clickSubmitGroupButton(){
        click(submitGroupButton);
        return this;
    }

    public AddGroupPage clickAddGroupUserButton(){
        click(addGroupUsersButton1);
        return this;
    }

    public AddGroupPage clickCoursesButton(){
        click(coursesButton);
        return this;
    }

    public AddGroupPage clickGetAddGroupCoursesButton1(){
        click(getAddGroupCoursesButton1);
        return this;

    }
    public AddGroupPage clickGetAddGroupCoursesButton3(){
        click(getAddGroupCoursesButton3);
        return this;
    }

    public AddGroupPage clickGetAddGroupCoursesButton4(){
        click(getAddGroupCoursesButton4);
        return this;
    }

    public AddGroupPage clickGetAddGroupCoursesButton6(){
        click(getAddGroupCoursesButton6);
        return this;
    }

    public AddGroupPage clickGroupsPageButton(){
        click(groupsPageButton);
        return this;
    }

    public AddGroupPage clickSelectGroupButton(){
        click(selectGroupButton);
        return this;
    }

    public AddGroupPage clickDeleteGroupButton(){
        click(deleteGroupButton);
        return this;
    }

    public AddGroupPage clickDeleteGroup(){
        click(deleteGroup);
        return this;
    }

    public AddGroupPage clickHomeButton(){
        click(homeButton);
        return this;
    }
}
