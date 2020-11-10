package br.com.testinguniversity.automation.course;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:/features/course"},
        plugin = {"pretty", "json:target/cucumber/course.json"}
)

public class CourseCucumberRunner {

}
