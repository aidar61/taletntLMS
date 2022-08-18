package UI.stepDefinitions.steps;

import UI.BaseUITestRinat;
import UI.dataProviders.ConfigReader;
import UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

public class StepTestGroupRinat extends BaseUITestRinat {
    @Given("пользователь находится на странице входа в систему")
    public void пользователь_находится_на_странице_входа_в_систему() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
    }
    @Then("заходит в систему используя следующие данные")
    public void заходит_в_систему_используя_следующие_данные() {
    }
    @Then("в USERNAME OR EMAIL вводит {string}")
    public void в_username_or_email_вводит(String email) {
       addGroupPage.loginInput(email);
    }
    @Then("в PASSWORD вводит {string}")
    public void в_password_вводит(String password) {
       addGroupPage.passwordInput(password);
    }
    @Then("кликает кнопку Login")
    public void кликает_кнопку_login() {
       addGroupPage.clickLoginButton();
    }
    @Then("пользователь зашел в систему в качестве админа")
    public void пользователь_зашел_в_систему_в_качестве_админа() {
    }
    @Then("админ кликнул раздел Add group")
    public void админ_кликнул_раздел_add_group() {
       addGroupPage.clickButtonGroup();
    }
    @When("админ зашел в раздел Add group")
    public void админ_зашел_в_раздел_add_group() {
    }
    @When("в поле Name написал {string}")
    public void в_поле_name_написал(String name) {
   addGroupPage.inputName(name);
    }
    @Then("в поле Description написал {string}")
    public void в_поле_description_написал(String description) {
     addGroupPage.inputDescription(description);
    }
    @Then("админ кликнул Group key")
    public void админ_кликнул_group_key() {
        addGroupPage.buttonGroupKey();

    }

    @Then("админ кликнул Price")
    public void админ_кликнул_price() {
       addGroupPage.clickPriceButton();
       
    }
    @Then("в поле прайс ввел цифру {string}")
    public void в_поле_прайс_ввел_цифру(String price) {
      addGroupPage.amountPriceInput(price);
    }
    @Then("кликнул Add group")
    public void кликнул_add_group() {
       addGroupPage.clickSubmitGroupButton();
       
    }
    @When("админ перешел на другую страницу")
    public void админ_перешел_на_другую_страницу() {
       
       
    }
    @Then("добавил в группу пользователя нажав +")
    public void добавил_в_группу_пользователя_нажав() {
       addGroupPage.clickAddGroupUserButton();
       
    }
    @Then("админ в левом верхнем углу кликнул Courses")
    public void админ_в_левом_верхнем_углу_кликнул_courses() {
       addGroupPage.clickCoursesButton();
       
    }
    @Then("выбрал несколько курсов нажав +")
    public void выбрал_несколько_курсов_нажав() {
       addGroupPage.clickGetAddGroupCoursesButton1();
       addGroupPage.clickGetAddGroupCoursesButton3();
       addGroupPage.clickGetAddGroupCoursesButton4();
       addGroupPage.clickGetAddGroupCoursesButton6();

    }
    @Then("в левом верхнем углу кликнул Groups")
    public void в_левом_верхнем_углу_кликнул_groups() {
       addGroupPage.clickGroupsPageButton();
       
    }
    @Then("в списке кликнул группу test")
    public void в_списке_кликнул_группу_test() {
       addGroupPage.clickSelectGroupButton();
       
    }
    @When("админ зашел в группу")
    public void админ_зашел_в_группу() {
       
       
    }
    @Then("кликнул в правом нижнем углу Delete")
    public void кликнул_в_правом_нижнем_углу_delete() {
       addGroupPage.clickDeleteGroupButton();
       
    }
    @Then("в всплывающем окне еще раз кликнул Delete")
    public void в_всплывающем_окне_еще_раз_кликнул_delete() {
   addGroupPage.clickDeleteGroup();
       
    }
    @Then("админ вернулся на главную страницу кликнув в левом верхнем углу Home")
    public void админ_вернулся_на_главную_страницу_кликнув_в_левом_верхнем_углу_home() {
       addGroupPage.clickHomeButton();
       
    }
}
