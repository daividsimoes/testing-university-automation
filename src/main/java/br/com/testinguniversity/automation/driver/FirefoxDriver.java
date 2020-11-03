package br.com.testinguniversity.automation.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
@ConditionalOnProperty(name = "application.webdriver", havingValue = "firefox")
public class FirefoxDriver {

    private final String FIREFOX_DRIVER_VERSION = "v0.25.0";

    @Bean
    public WebDriver webDriver() {

        WebDriverManager.firefoxdriver().version(FIREFOX_DRIVER_VERSION).setup();

        WebDriver webDriver = new org.openqa.selenium.firefox.FirefoxDriver();
        webDriver.manage().window().maximize();

        return webDriver;
    }
}
