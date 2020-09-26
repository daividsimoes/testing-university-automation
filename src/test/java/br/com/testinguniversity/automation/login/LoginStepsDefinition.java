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

    @When("I click on login button")
    public void i_click_on_login_button() {

        loginPageObject.clickLoginButton();
    }

    @Then("Should perform login successfully")
    public void should_perform_login_successfully() {

        loginPageObject.waitMainPage();
    }
}
