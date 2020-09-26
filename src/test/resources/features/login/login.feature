Feature: Application login

    Scenario: Login in application with default user
        Given I'm in the login page
        When I enter default username and password
        And I click on login button
        Then Should perform login successfully
