package br.com.testinguniversity.automation.pageobject.login;

import org.openqa.selenium.By;

public class LoginLocators {

    protected static final By AVATAR = By.cssSelector(".login-form .imgcontainer img.avatar");

    protected static final By USERNAME_INPUT_TEXT = By
            .xpath("//form[contains(@class, 'login-form')]//input[@placeholder='Enter Username']");

    protected static final By PASSWORD_INPUT_TEXT = By.id("user-name-password");

    protected static final By LOGIN_BUTTON = By.cssSelector(".login-form .green-backgroud-btn[type='submit']");

    protected static final By CREATE_ACCOUNT_BUTTON = By
            .xpath("//form[contains(@class, 'login-form')]//button[contains(@class, red-backgroud-btn) and contains(text(), 'Create Account')]");

    protected static final By WELCOME_TEXT = By.xpath("//h1[contains(text(),'Welcome to Testing University')]");

    protected static final By INVALID_USER_PASSWORD = By.
            xpath("//form[contains(@class, 'login-form')]//b[contains(text(), ''{0}'')]");

    protected static final By CREATE_ACCOUNT_USERNAME_INPUT_TEXT = By.id("add-account-username");

    protected static final By CREATE_ACCOUNT_PASSWORD_INPUT_TEXT = By.id("add-account-password");

    protected static final By CREATE_ACCOUNT_TEXT = By.xpath("//h1[contains(text(), 'Create new account')]");
}
