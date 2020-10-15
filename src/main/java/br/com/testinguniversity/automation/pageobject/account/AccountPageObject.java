package br.com.testinguniversity.automation.pageobject.account;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.pageobject.AbstractPageObject;

@Component
public class AccountPageObject extends AbstractPageObject {

    private WebElement webElement;

    public void waitCreateAccountPage() {

        waitUntilElementIsVisible(AccountPageLocators.CREATE_ACCOUNT_TEXT);
        waitUntilElementIsVisible(AccountPageLocators.CREATE_ACCOUNT_USERNAME_INPUT_TEXT);
        waitUntilElementIsVisible(AccountPageLocators.CREATE_ACCOUNT_PASSWORD_INPUT_TEXT);
    }

    public void setNewAccountUsername(String username) {

        webElement = findElementBy(AccountPageLocators.CREATE_ACCOUNT_USERNAME_INPUT_TEXT);
        addText(webElement, username);
    }

    public void setNewAccountPassword(String password) {

        webElement = findElementBy(AccountPageLocators.CREATE_ACCOUNT_PASSWORD_INPUT_TEXT);
        addText(webElement, password);
    }

    public void clickSubmitButton() {

        webElement = findElementBy(AccountPageLocators.CREATE_ACCOUNT_SUBMIT_BUTTON);
        clickElement(webElement);
    }

    public void clickGoBackButton() {

        webElement = findElementBy(AccountPageLocators.CREATE_ACCOUNT_GO_BACK_BUTTON);
        clickElement(webElement);
    }

    public WebElement getUsernameInputText() {

        return findElementBy(AccountPageLocators.CREATE_ACCOUNT_USERNAME_INPUT_TEXT);
    }

    public WebElement getPasswordInputText() {

        return findElementBy(AccountPageLocators.CREATE_ACCOUNT_PASSWORD_INPUT_TEXT);
    }
}
