Feature: Create Course

    Scenario: Validate new course added is showed in list
        Given I'm in the course list page
        And I click on add new course button
        When I enter data
        And I click on submit button
        Then New course should be showed in the list
