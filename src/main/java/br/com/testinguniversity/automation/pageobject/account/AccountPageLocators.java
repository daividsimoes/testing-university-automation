package br.com.testinguniversity.automation.pageobject.account;

import org.openqa.selenium.By;

public class AccountPageLocators {

    protected static final By CREATE_ACCOUNT_USERNAME_INPUT_TEXT = By.id("add-account-username");

    protected static final By CREATE_ACCOUNT_PASSWORD_INPUT_TEXT = By.id("add-account-password");

    protected static final By CREATE_ACCOUNT_TEXT = By.xpath("//h1[contains(text(), 'Create new account')]");

    protected static final By CREATE_ACCOUNT_SUBMIT_BUTTON = By.xpath("//form//input[@type = 'submit']");

    protected static final By CREATE_ACCOUNT_GO_BACK_BUTTON = By.cssSelector(".container .go-back.w3-button.w3-tiny");
}
