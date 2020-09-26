package br.com.testinguniversity.automation.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class PropertiesUtils {

    @Value("${application.login.url}")
    private String urlBase;

    @Value("${application.login.default.username}")
    private String usernameDefault;

    @Value("${application.login.default.password}")
    private String passwordDefault;
}
