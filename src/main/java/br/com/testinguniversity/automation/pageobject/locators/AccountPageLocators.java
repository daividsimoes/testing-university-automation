package br.com.testinguniversity.automation.pageobject.locators;

import org.openqa.selenium.By;

public class AccountPageLocators {

    public static final By CREATE_ACCOUNT_USERNAME_INPUT_TEXT = By.id("add-account-username");

    public static final By CREATE_ACCOUNT_PASSWORD_INPUT_TEXT = By.id("add-account-password");

    public static final By CREATE_ACCOUNT_TEXT = By.xpath("//h1[contains(text(), 'Create new account')]");

    public static final By CREATE_ACCOUNT_SUBMIT_BUTTON = By.xpath("//form//input[@type = 'submit']");
}
