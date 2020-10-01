package br.com.testinguniversity.automation.pageobject.login;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.pageobject.AbstractPageObject;

@Component
public class LoginPageObject extends AbstractPageObject {

    private WebElement webElement;

    public void openLoginPage() {

        driver.get(propertiesUtils.getUrlBase());
        waitLoginPage();
    }

    public void setUsernameDefault() {

        webElement = findElementBy(LoginLocators.USERNAME_INPUT_TEXT);
        addText(webElement, propertiesUtils.getUsernameDefault());
    }

    public void setUsername(String username) {

        webElement = findElementBy(LoginLocators.USERNAME_INPUT_TEXT);
        addText(webElement, username);
    }

    public void setPasswordDefault() {

        webElement = findElementBy(LoginLocators.PASSWORD_INPUT_TEXT);
        addText(webElement, propertiesUtils.getPasswordDefault());
    }

    public void setPassword(String password) {

        webElement = findElementBy(LoginLocators.PASSWORD_INPUT_TEXT);
        addText(webElement, password);
    }

    public void clickLoginButton() {

        webElement = findElementBy(LoginLocators.LOGIN_BUTTON);
        clickElement(webElement);
    }

    public void clickCreateAccountButton() {

        webElement = findElementBy(LoginLocators.CREATE_ACCOUNT_BUTTON);
        clickElement(webElement);
    }

    public void waitMainPage() {

        waitUntilElementIsVisible(LoginLocators.WELCOME_TEXT);
    }

    public void waitLoginPage() {
        waitUntilElementIsVisible(LoginLocators.AVATAR);
    }

    public void waitCreateAccountPage() {
        waitUntilElementIsVisible(LoginLocators.CREATE_ACCOUNT_TEXT);
        waitUntilElementIsVisible(LoginLocators.CREATE_ACCOUNT_USERNAME_INPUT_TEXT);
        waitUntilElementIsVisible(LoginLocators.CREATE_ACCOUNT_PASSWORD_INPUT_TEXT);
    }

    public void validateInvalidLoginMessage(String message) {

        webElement = findElementBy(locatorsUtils.normalizeLocatorByXpath(LoginLocators.INVALID_USER_PASSWORD, message));
        String elementText = webElement.getText();
        assertEquals(message, elementText);
    }
}
