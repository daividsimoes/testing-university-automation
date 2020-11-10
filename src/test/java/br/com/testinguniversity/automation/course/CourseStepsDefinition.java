package br.com.testinguniversity.automation.course;

import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.testinguniversity.automation.AbstractStepsDefinition;
import br.com.testinguniversity.automation.pageobject.course.CourseListPageObject;
import br.com.testinguniversity.automation.pageobject.login.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CourseStepsDefinition extends AbstractStepsDefinition {

    @Autowired
    private LoginPageObject loginPageObject;

    @Autowired
    private CourseListPageObject courseListPageObject;

    private String name;

    private int maxStudents;

    private int duration;

    @Given("I'm in the course list page")
    public void i_m_in_the_course_list_page() {

        loginPageObject.openLoginPage();
        loginPageObject.waitLoginPage();
        doLogin();
    }

    @Given("I click on add new course button")
    public void i_click_on_add_new_course_button() {

        courseListPageObject.clickAddCourseButton();
        courseListPageObject.waitAddCourseModalIsVisible();
    }

    @When("I enter data")
    public void i_enter_data() {

        name = fakerUtils.generateRandomCourseName();
        maxStudents = fakerUtils.GenerateRandomIntNumberBetween(10, 20);
        duration = fakerUtils.GenerateRandomIntNumberBetween(0, 5);

        courseListPageObject.setCourseName(name);
        courseListPageObject.setMaxStudents(maxStudents);
        courseListPageObject.selectCourseDuration(duration);
    }

    @When("I click on submit button")
    public void i_click_on_submit_button() {

        courseListPageObject.clickSubmitButton();
    }

    @Then("New course should be showed in the list")
    public void new_course_should_be_showed_in_the_list() {

        WebElement element = courseListPageObject.getCourse(name);
        assertEquals(name, element.getText());
    }

    private void doLogin() {

        loginPageObject.setUsernameDefault();
        loginPageObject.setPasswordDefault();
        loginPageObject.clickLoginButton();
        courseListPageObject.waitCourseListPage();
    }
}
