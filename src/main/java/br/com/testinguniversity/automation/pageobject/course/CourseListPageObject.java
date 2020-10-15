package br.com.testinguniversity.automation.pageobject.course;

import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.pageobject.AbstractPageObject;

@Component
public class CourseListPageObject extends AbstractPageObject {

    public void waitCourseListPage() {

        waitUntilElementIsVisible(CourseListPageLocators.WELCOME_TEXT);
    }
}
