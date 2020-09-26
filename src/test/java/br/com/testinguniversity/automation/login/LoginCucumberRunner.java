package br.com.testinguniversity.automation.login;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:/features/login"},
        plugin = {"pretty", "json:target/cucumber/login.json"}
)

public class LoginCucumberRunner {

}
