package br.com.testinguniversity.automation.pageobject.account;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.pageobject.AbstractPageObject;
import br.com.testinguniversity.automation.pageobject.locators.CreateAccountPageLocators;

@Component
public class CreateAccountPageObject extends AbstractPageObject {

    private WebElement webElement;

    public void waitCreateAccountPage() {

        waitUntilElementIsVisible(CreateAccountPageLocators.CREATE_ACCOUNT_TEXT);
        waitUntilElementIsVisible(CreateAccountPageLocators.CREATE_ACCOUNT_USERNAME_INPUT_TEXT);
        waitUntilElementIsVisible(CreateAccountPageLocators.CREATE_ACCOUNT_PASSWORD_INPUT_TEXT);
    }

    public void setNewAccountUsername(String username) {

        webElement = findElementBy(CreateAccountPageLocators.CREATE_ACCOUNT_USERNAME_INPUT_TEXT);
        addText(webElement, username);
    }

    public void setNewAccountPassword(String password) {

        webElement = findElementBy(CreateAccountPageLocators.CREATE_ACCOUNT_PASSWORD_INPUT_TEXT);
        addText(webElement, password);
    }

    public void clickSubmitButton() {

        webElement = findElementBy(CreateAccountPageLocators.CREATE_ACCOUNT_SUBMIT_BUTTON);
        clickElement(webElement);
    }
}
