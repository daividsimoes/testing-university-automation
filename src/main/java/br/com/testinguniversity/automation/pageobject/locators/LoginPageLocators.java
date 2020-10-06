package br.com.testinguniversity.automation.pageobject.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {

    public static final By AVATAR = By.cssSelector(".login-form .imgcontainer img.avatar");

    public static final By USERNAME_INPUT_TEXT = By
            .xpath("//form[contains(@class, 'login-form')]//input[@placeholder='Enter Username']");

    public static final By PASSWORD_INPUT_TEXT = By.id("user-name-password");

    public static final By LOGIN_BUTTON = By.cssSelector(".login-form .green-backgroud-btn[type='submit']");

    public static final By CREATE_ACCOUNT_BUTTON = By
            .xpath("//form[contains(@class, 'login-form')]//button[contains(@class, red-backgroud-btn) and contains(text(), 'Create Account')]");

    public static final By INVALID_USER_PASSWORD = By.
            xpath("//form[contains(@class, 'login-form')]//b[contains(text(), ''{0}'')]");
}
