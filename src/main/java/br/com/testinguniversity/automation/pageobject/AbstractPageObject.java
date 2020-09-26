package br.com.testinguniversity.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.util.FakerUtils;
import br.com.testinguniversity.automation.util.PropertiesUtils;

@Component
public class AbstractPageObject {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @Autowired
    protected PropertiesUtils propertiesUtils;

    protected void waitUntilElementIsVisible(By locator) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
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
}
