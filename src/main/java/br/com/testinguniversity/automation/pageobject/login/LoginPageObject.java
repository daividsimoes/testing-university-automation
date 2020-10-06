package br.com.testinguniversity.automation.pageobject.login;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.pageobject.AbstractPageObject;
import br.com.testinguniversity.automation.pageobject.locators.LoginPageLocators;

@Component
public class LoginPageObject extends AbstractPageObject {

    private WebElement webElement;

    public void openLoginPage() {

        openPage(propertiesUtils.getUrlBase());
        waitLoginPage();
    }

    public void setUsernameDefault() {

        webElement = findElementBy(LoginPageLocators.USERNAME_INPUT_TEXT);
        addText(webElement, propertiesUtils.getUsernameDefault());
    }

    public void setUsername(String username) {

        webElement = findElementBy(LoginPageLocators.USERNAME_INPUT_TEXT);
        addText(webElement, username);
    }

    public void setPasswordDefault() {

        webElement = findElementBy(LoginPageLocators.PASSWORD_INPUT_TEXT);
        addText(webElement, propertiesUtils.getPasswordDefault());
    }

    public void setPassword(String password) {

        webElement = findElementBy(LoginPageLocators.PASSWORD_INPUT_TEXT);
        addText(webElement, password);
    }

    public void clickLoginButton() {

        webElement = findElementBy(LoginPageLocators.LOGIN_BUTTON);
        clickElement(webElement);
    }

    public void clickCreateAccountButton() {

        webElement = findElementBy(LoginPageLocators.CREATE_ACCOUNT_BUTTON);
        clickElement(webElement);
    }

    public void waitLoginPage() {

        waitUntilElementIsVisible(LoginPageLocators.AVATAR);
    }

    public void validateInvalidLoginMessage(String message) {

        webElement = findElementBy(
                locatorsUtils.normalizeLocatorByXpath(LoginPageLocators.INVALID_USER_PASSWORD, message));
        String elementText = webElement.getText();
        assertEquals(message, elementText);
    }
}
