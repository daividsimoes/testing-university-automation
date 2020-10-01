package br.com.testinguniversity.automation.util;

import java.text.MessageFormat;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class LocatorsUtils {

    public By normalizeLocatorByXpath(By by, Object... args) {

        String locator = getLocator(by);
        return By.xpath(MessageFormat.format(locator, args));
    }

    private String getLocator(By by) {

        return StringUtils.substringAfter(by.toString(), "By.xpath: ");
    }
}
