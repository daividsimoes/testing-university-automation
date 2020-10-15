package br.com.testinguniversity.automation.util;

import java.text.MessageFormat;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class LocatorsUtils {

    public By normalizeLocatorByXpath(By locator, Object... args) {

        String xpath = getLocatorByXpath(locator);
        return By.xpath(MessageFormat.format(xpath, args));
    }

    private String getLocatorByXpath(By locator) {

        return StringUtils.substringAfter(locator.toString(), "By.xpath: ");
    }
}
