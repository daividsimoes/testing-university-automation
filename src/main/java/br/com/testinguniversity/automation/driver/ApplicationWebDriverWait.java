package br.com.testinguniversity.automation.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApplicationWebDriverWait {

    @Autowired
    private WebDriver driver;

    private static final int DEFAULT_WAIT_IN_SECONDS = 10;

    @Bean
    public WebDriverWait webDriverWait () {

        return new WebDriverWait(driver, DEFAULT_WAIT_IN_SECONDS);
    }
}
