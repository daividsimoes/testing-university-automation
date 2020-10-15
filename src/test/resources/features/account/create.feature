Feature: Create Account

    Scenario: Validate user return to login page when create new account
        Given I'm in the create account page
        When I enter username and password
        And I click on submit button
        Then Should return to login page

    Scenario: Validate user cannot create account without username
        Given I'm in the create account page
        When I enter only password
        And I click on submit button
        Then Should show error message "Enter a valid username" for username field

    Scenario: Validate user cannot create account without password
        Given I'm in the create account page
        When I enter only username
        And I click on submit button
        Then Should show error message "Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" for password field

    Scenario: Validate go back button return to login page
        Given I'm in the create account page
        When I click on go back button
        Then Should return to login page