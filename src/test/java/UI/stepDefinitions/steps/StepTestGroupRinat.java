package UI.stepDefinitions.steps;

import UI.BaseUITestRinat;
import UI.dataProviders.ConfigReader;
import UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
    @When("в поле Name написал Test")
    public void в_поле_name_написал_test(String text) {
       addGroupPage.inputName(text);
       
    }
    @Then("в поле Description написал Test1")
    public void в_поле_description_написал_test1(String description) {
       addGroupPage.inputDescription(description);
    }
    @Then("админ кликнул Group key")
    public void админ_кликнул_group_key() {
    }
    @Then("в Group key очистил данные")
    public void в_group_key_очистил_данные() {
       addGroupPage.buttonGroupKey("tes123");
       
    }
    @Then("в Group key написал test123")
    public void в_group_key_написал_test123() {
       
       
    }
    @Then("админ кликнул Price")
    public void админ_кликнул_price() {
       
       
    }
    @Then("в поле прайс ввел цифру {int}")
    public void в_поле_прайс_ввел_цифру(Integer int1) {
       
       
    }
    @Then("кликнул Add group")
    public void кликнул_add_group() {
       
       
    }
    @When("админ перешел на другую страницу")
    public void админ_перешел_на_другую_страницу() {
       
       
    }
    @Then("добавил в группу пользователя нажав +")
    public void добавил_в_группу_пользователя_нажав() {
       
       
    }
    @Then("админ в левом верхнем углу кликнул Courses")
    public void админ_в_левом_верхнем_углу_кликнул_courses() {
       
       
    }
    @Then("выбрал несколько курсов нажав +")
    public void выбрал_несколько_курсов_нажав() {
       
       
    }
    @Then("в левом верхнем углу кликнул Groups")
    public void в_левом_верхнем_углу_кликнул_groups() {
       
       
    }
    @Then("в списке кликнул группу test")
    public void в_списке_кликнул_группу_test() {
       
       
    }
    @When("админ зашел в группу")
    public void админ_зашел_в_группу() {
       
       
    }
    @Then("кликнул в правом нижнем углу Delete")
    public void кликнул_в_правом_нижнем_углу_delete() {
       
       
    }
    @Then("в всплывающем окне еще раз кликнул Delete")
    public void в_всплывающем_окне_еще_раз_кликнул_delete() {
       
       
    }
    @Then("админ вернулся на главную страницу кликнув в левом верхнем углу Home")
    public void админ_вернулся_на_главную_страницу_кликнув_в_левом_верхнем_углу_home() {
       
       
    }
}
