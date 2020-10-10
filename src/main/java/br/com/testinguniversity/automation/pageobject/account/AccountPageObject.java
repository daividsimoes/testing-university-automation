package br.com.testinguniversity.automation.pageobject.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.pageobject.AbstractPageObject;
import br.com.testinguniversity.automation.pageobject.locators.AccountPageLocators;

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

    public WebElement getUsernameInputText() {

        return getWebElement(AccountPageLocators.CREATE_ACCOUNT_USERNAME_INPUT_TEXT);
    }

    public WebElement getPasswordInputText() {

        return getWebElement(AccountPageLocators.CREATE_ACCOUNT_PASSWORD_INPUT_TEXT);
    }

    private WebElement getWebElement(By locator) {

        return driver.findElement(locator);
    }
}
