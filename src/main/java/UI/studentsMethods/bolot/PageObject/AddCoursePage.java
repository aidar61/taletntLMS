package UI.studentsMethods.bolot.PageObject;

import UI.utils.Driver;
import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class AddCoursePage extends BasePage {
    public AddCoursePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public String constantCourseName = mockDataGenerator.generateCourseName();
    public String constantDescription = mockDataGenerator.descriptiontextGenerate();
    public int constantCourseCode = mockDataGenerator.generateCourseCode();
    public int constCoursePrice = mockDataGenerator.generatePrice();
    public int constantCapacity = mockDataGenerator.generateCapacity();
    public int constantTimeLimitOfDays = mockDataGenerator.generateTimeLimitDays();

    ArrayList<Integer>courseCodeList = new ArrayList<>();
@FindBy(xpath = "//input[@name='login']")
public WebElement userNameOrEmailInputField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "(//div[@class='control-group'])[1]")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[@href='https://aidar.talentlms.com/course/create'])[2]")
    public WebElement addCourseButton;


    @FindBy(xpath = "//input[@name='name']")
    public WebElement courseNameInputField;


    @FindBy(xpath = "(//*[@class='select2-focusser select2-offscreen'])[1]")
    public WebElement category;

    @FindBy(xpath = "(//*[@name='description'])[2]")
    public WebElement description;


    @FindBy(xpath = "//*[@id='show-coursecode']")
    public WebElement courseCodeButton;


    @FindBy(xpath = "//*[@name='course_code']")
    public WebElement courseCodeInputField;


    @FindBy(xpath = "//*[@id='show-price']")
    public WebElement priceButton;

    @FindBy(xpath = "//*[@name='price']")
    public WebElement priceInputField;


    @FindBy(xpath = "//*[@id='show-intro-video-url']")
    public WebElement introVideo;


    @FindBy(xpath = "//*[@id='course-intro-video-url']")
    public WebElement videoInputButton;


    @FindBy(xpath = "//*[@id='show-capacity']")
    public WebElement capacityButton;

    @FindBy(xpath = "//*[@id='course-capacity']")
    public WebElement capacityInputField;


    @FindBy(xpath = "//*[@class='btn toggle-time-options']")
    public WebElement timeLimiteButton;

    @FindBy(xpath = "//*[@id='course-timelimit']")
    public WebElement daysLimitInputField;

    @FindBy(xpath = "//*[@id='show-certification']")
    public WebElement certificationButton;


    @FindBy(xpath = "//*[@id='course-certification']")
    public WebElement certificationSelectButton;



    @FindBy(xpath = "//*[@id='show-level']")
    public WebElement levelButton;

    @FindBy(xpath = "//*[@id='course-level']")
    public WebElement selectLevelButton;


    @FindBy(xpath = "//*[@name='submit_course']")
    public WebElement saveAndselectUsersButton;




    @FindBy(xpath = "//*[@id='show-time-options']")
    public WebElement timeOptionButton;

    @FindBy(xpath = "(//*[text()='Course'])[2]")
    public WebElement goToCourseButton;


    @FindBy(xpath = "//*[@name='submit_course']")
    public WebElement courseSubmitButton;


    public AddCoursePage inputUserNameOrEmail(String userName){
        helper.sendKeys(userNameOrEmailInputField, userName);
        return this;
    }

    public AddCoursePage inputPassword(String password){
        helper.sendKeys(passwordInputField, password);
        return this;
    }

    public AddCoursePage clickSubmitButton(){
        helper.click(submitButton);
        return this;
    }

    public AddCoursePage clickAddCourseButton(){
        helper.waitElementToBeClickableAndVisible(addCourseButton);
        helper.click(addCourseButton);
        return this;
    }

    public AddCoursePage coursNameInput(){
        helper.waitElementToBeVisible(courseNameInputField);
        helper.sendKeys(courseNameInputField, constantCourseName + Keys.TAB);
        return this;
    }



    public AddCoursePage categoryInput(){
        helper.sendKeys(category, "Groupe"+ Keys.TAB);
        return this;
    }

    public AddCoursePage inputDescription(){
        helper.sendKeys(description, constantDescription + Keys.TAB);
        return this;
    }

    public AddCoursePage inputCourseCode(){
        helper.click(courseCodeButton);
        helper.waitElementToBeVisible(courseCodeInputField);
        helper.sendKeys(courseCodeInputField, Integer.toString(constantCourseCode) + Keys.TAB);
        courseCodeList.add(constantCourseCode);
        return this;
    }

    public AddCoursePage inputCoursePrice(){
        helper.click(priceButton);
        helper.sendKeys(priceInputField, Integer.toString(constCoursePrice) + Keys.TAB);
        return this;
    }


    public AddCoursePage inputVideo(){
        helper.click(introVideo);
        helper.sendKeys(videoInputButton, "https://www.youtube.com/watch?v=7GyEqSxXd14&t=9s" + Keys.TAB);
        return this;
    }

    public AddCoursePage inputCapacity(){
        helper.click(capacityButton);
        helper.sendKeys(capacityInputField, Integer.toString(constantCapacity) + Keys.TAB);
        return this;
    }

    public AddCoursePage timeOptionsInput(){
        helper.click(timeOptionButton);
        helper.waitElementToBeVisible(timeLimiteButton);
        helper.click(timeLimiteButton);
        helper.waitElementToBeVisible(daysLimitInputField);
        helper.sendKeys(daysLimitInputField, Integer.toString(constantTimeLimitOfDays) + Keys.TAB);
        //jsExequterHelper.scrollDown();
        return this;
    }

    public AddCoursePage certificationSelect(){
        helper.click(certificationButton);
        dropDownHelper.clickELementByIndex(certificationSelectButton, 2);
        return this;
    }

    public AddCoursePage levelSelect(){
        helper.click(levelButton);
        dropDownHelper.clickELementByIndex(selectLevelButton, 2);
        return this;
    }

    public AddCoursePage saveAndSelectUs(){
        helper.click(saveAndselectUsersButton);
        return this;
    }

    public AddCoursePage clickGoToCourseButton(){
        helper.waitElementToBeClickableAndVisible(goToCourseButton);
        helper.click(goToCourseButton);
        return this;
    }

    public AddCoursePage clickCourseSubmitButton(){
        helper.waitElementToBeClickableAndVisible(courseSubmitButton);
        helper.click(courseSubmitButton);
        return this;
    }

    public String GetAttributeByValue(){
       return helper.getAttributeByValue(courseNameInputField, "value");

    }



}
