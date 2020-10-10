package br.com.testinguniversity.automation.account;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:/features/account"},
        plugin = {"pretty", "json:target/cucumber/account.json"}
)

public class AccountCucumberRunner {

}
