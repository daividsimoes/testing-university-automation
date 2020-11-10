package br.com.testinguniversity.automation.pageobject.course;

import org.openqa.selenium.By;

public class CourseListPageLocators {

    protected static final By WELCOME_TEXT = By.xpath("//h1[contains(text(), 'Welcome to Testing University')]");

    protected static final By ADD_COURSE_BUTTON = By
            .xpath("//button[contains(@class, 'w3-button w3-circle add-btn')][contains(text(), '+')]");

    protected static final By ADD_COURSE_MODAL_HEADER = By.xpath("//h2[contains(text(), 'Add New Course')]");

    protected static final By ADD_COURSE_MODAL = By
            .xpath("//div[@id = 'add-course-modal']//div[contains(@class, 'w3-modal-content')]//form");

    protected static final By ADD_COURSE_NAME_INPUT_TEXT = By.id("add-course-name");

    protected static final By ADD_COURSE_MAX_STUDENTS_INPUT_TEXT = By.id("add-course-max-students");

    protected static final By ADD_COURSE_DURATION_DROPDOWN = By.id("add-course-load");

    protected static final By ADD_COURSE_SUBMIT_BUTTON = By
            .xpath("//div[@id = 'add-course-modal']//form//input[@type = 'submit']");

    protected static final By COURSE_LIST_ELEMENT = By
            .xpath("//ul//li[contains(text(), ''{0}'')]");
}
