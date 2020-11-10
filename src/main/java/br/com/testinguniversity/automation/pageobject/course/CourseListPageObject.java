package br.com.testinguniversity.automation.pageobject.course;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import br.com.testinguniversity.automation.pageobject.AbstractPageObject;

@Component
public class CourseListPageObject extends AbstractPageObject {

    public void waitCourseListPage() {

        waitUntilElementIsVisible(CourseListPageLocators.WELCOME_TEXT);
        waitUntilElementIsClickable(CourseListPageLocators.ADD_COURSE_BUTTON);
    }

    public void waitAddCourseModalIsVisible() {

        waitUntilElementIsVisible(CourseListPageLocators.ADD_COURSE_MODAL_HEADER);
        waitUntilElementIsVisible(CourseListPageLocators.ADD_COURSE_MODAL);
    }

    public void clickAddCourseButton() {

        WebElement element = findElementBy(CourseListPageLocators.ADD_COURSE_BUTTON);
        mouseHoverOverElement(element);
        clickElement(element);
    }

    public void setCourseName(String name) {

        WebElement element = findElementBy(CourseListPageLocators.ADD_COURSE_NAME_INPUT_TEXT);
        addText(element, name);
    }

    public void setMaxStudents(int maxStudents) {

        WebElement element = findElementBy(CourseListPageLocators.ADD_COURSE_MAX_STUDENTS_INPUT_TEXT);
        addText(element, String.valueOf(maxStudents));
    }

    public void selectCourseDuration(int durationYear) {

        WebElement element = findElementBy(CourseListPageLocators.ADD_COURSE_DURATION_DROPDOWN);
        selectDropDownElementByIndex(getDropDownElement(element), durationYear);
    }

    public void clickSubmitButton() {

        WebElement element = findElementBy(CourseListPageLocators.ADD_COURSE_SUBMIT_BUTTON);
        clickElement(element);
    }

    public WebElement getCourse(String name) {

        return findElementBy(
                locatorsUtils.normalizeLocatorByXpath(CourseListPageLocators.COURSE_LIST_ELEMENT, name));
    }
}
