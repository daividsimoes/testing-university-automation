package br.com.testinguniversity.automation.pageobject.login;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.pageobject.AbstractPageObject;

@Component
public class LoginPageObject extends AbstractPageObject {

    private WebElement webElement;

    public void openLoginPage() {

        driver.get(propertiesUtils.getUrlBase());
        waitUntilElementIsVisible(LoginLocators.AVATAR);
    }

    public void setUsernameDefault() {

        webElement = findElementBy(LoginLocators.USERNAME_INPUT_TEXT);
        addText(webElement, propertiesUtils.getUsernameDefault());
    }

    public void setPasswordDefault() {

        webElement = findElementBy(LoginLocators.PASSWORD_INPUT_TEXT);
        addText(webElement, propertiesUtils.getPasswordDefault());
    }

    public void clickLoginButton() {

        webElement = findElementBy(LoginLocators.LOGIN_BUTTON);
        clickElement(webElement);
    }

    public void waitMainPage() {

        waitUntilElementIsVisible(LoginLocators.WELCOME_TEXT);
    }
}
