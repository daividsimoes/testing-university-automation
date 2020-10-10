package br.com.testinguniversity.automation.account;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.testinguniversity.automation.AbstractStepsDefinition;
import br.com.testinguniversity.automation.pageobject.account.AccountPageObject;
import br.com.testinguniversity.automation.pageobject.login.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountStepsDefinition extends AbstractStepsDefinition {

    @Autowired
    private AccountPageObject accountPageObject;

    @Autowired
    private LoginPageObject loginPageObject;

    @Autowired
    private WebDriver driver;

    private String username;

    private String password;

    @Given("I'm in the create account page")
    public void i_m_in_the_create_account_page() {

        loginPageObject.openLoginPage();
        loginPageObject.waitLoginPage();
        loginPageObject.clickCreateAccountButton();
        accountPageObject.waitCreateAccountPage();
    }

    @When("I enter username and password")
    public void i_enter_username_and_password() {

        username = fakerUtils.generateRandomUsername();
        password = fakerUtils.generateRandomPassword();
        accountPageObject.setNewAccountUsername(username);
        accountPageObject.setNewAccountPassword(password);
    }

    @When("I click on submit button")
    public void i_click_on_submit_button() {

        accountPageObject.clickSubmitButton();
    }

    @When("I enter only password")
    public void i_enter_only_password() {

        password = fakerUtils.generateRandomPassword();
        accountPageObject.setNewAccountPassword(password);
    }

    @When("I enter only username")
    public void i_enter_only_username() {

        username = fakerUtils.generateRandomUsername();
        accountPageObject.setNewAccountUsername(username);

    }

    @Then("Should return to login page")
    public void should_return_to_login_page() {

        loginPageObject.waitLoginPage();
    }

    @Then("Should show error message {string} for username field")
    public void should_show_error_message_for_username_field(String message) {

        WebElement element = accountPageObject.getUsernameInputText();
        validateErrorMessage(element, message);
    }

    @Then("Should show error message {string} for password field")
    public void should_show_error_message_for_password_field(String message) {

        WebElement element = accountPageObject.getPasswordInputText();
        validateErrorMessage(element, message);
    }

    private void validateErrorMessage(WebElement element, String message) {

        String validationMessage = element.getAttribute("validationMessage");
        assertEquals(message, validationMessage);
    }
}
