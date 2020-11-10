package br.com.testinguniversity.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.util.LocatorsUtils;
import br.com.testinguniversity.automation.util.PropertiesUtils;

@Component
public class AbstractPageObject {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @Autowired
    protected PropertiesUtils propertiesUtils;

    @Autowired
    protected LocatorsUtils locatorsUtils;

    protected void openPage(String url) {

        driver.get(url);
    }

    protected void waitUntilElementIsVisible(By locator) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitUntilElementIsClickable(By locator) {

        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement findElementBy(By locator) {

        return driver.findElement(locator);
    }

    protected void clickElement(WebElement element) {

        element.click();
    }

    protected void addText(WebElement element, String text) {

        element.sendKeys(text);
    }

    protected Select getDropDownElement(WebElement element) {

        return new Select(element);
    }

    protected void selectDropDownElementByIndex(Select dropDown, int index) {

        dropDown.selectByIndex(index);
    }

    protected void mouseHoverOverElement(WebElement element) {

        new Actions(driver).moveToElement(element).perform();
    }

    protected String getElementText(WebElement element) {

        return element.getText();
    }
}
