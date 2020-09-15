package br.com.testinguniversity.automation.driver;

import org.openqa.selenium.WebDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
@ConditionalOnProperty(name = "application.webdriver", havingValue = "chrome")
public class ChromeDriver {

    private final String CHORME_DRIVER_VERSION = "85.0.4183.38";

    @Bean
    public WebDriver webDriver () {

         WebDriverManager.chromedriver().version(CHORME_DRIVER_VERSION).setup();

         WebDriver webDriver = new org.openqa.selenium.chrome.ChromeDriver();
         webDriver.manage().window().maximize();

         return webDriver;
    }
}
