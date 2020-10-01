package br.com.testinguniversity.automation.login;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.testinguniversity.automation.AbstractStepsDefinition;
import br.com.testinguniversity.automation.pageobject.login.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition extends AbstractStepsDefinition {

    @Autowired
    private LoginPageObject loginPageObject;

    @Given("I'm in the login page")
    public void i_m_in_the_login_page() {

        loginPageObject.openLoginPage();
    }

    @When("I enter default username and password")
    public void i_enter_default_username_and_password() {

        loginPageObject.setUsernameDefault();
        loginPageObject.setPasswordDefault();
    }

    @When("I enter invalid username and password")
    public void i_enter_invalid_username_and_passwor() {

        String username = fakerUtils.generateRandomUsername();
        String password = fakerUtils.generateRandomPassword();
        loginPageObject.setUsername(username);
        loginPageObject.setPassword(password);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {

        loginPageObject.clickLoginButton();
    }

    @When("I click on create account button")
    public void i_click_on_create_account_button() {

        loginPageObject.clickCreateAccountButton();
    }

    @Then("Should perform login successfully")
    public void should_perform_login_successfully() {

        loginPageObject.waitMainPage();
    }

    @Then("Should still be in login page")
    public void should_still_be_in_login_page() {

        loginPageObject.waitLoginPage();
    }

    @Then("Should show message {string}")
    public void should_show_message(String message) {

        loginPageObject.validateInvalidLoginMessage(message);
    }

    @Then("Should open create account page successfully")
    public void should_open_create_account_page_successfully() {

        loginPageObject.waitCreateAccountPage();
    }
}
