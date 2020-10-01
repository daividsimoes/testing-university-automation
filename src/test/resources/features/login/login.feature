Feature: Application login

    Scenario: Login in application with default user
        Given I'm in the login page
        When I enter default username and password
        And I click on login button
        Then Should perform login successfully

    Scenario: Validate user cannot login with invalid user and password
        Given I'm in the login page
        When I enter invalid username and password
        And I click on login button
        Then Should still be in login page
        Then Should show message "Invalid username or password!"

    Scenario: Validate user cannot login without user and password
        Given I'm in the login page
        When I click on login button
        Then Should still be in login page
        Then Should show message "Invalid username or password!"

    Scenario: Validate create account button open successfully
        Given I'm in the login page
        When I click on create account button
        Then Should open create account page successfully
