Feature: Login Feature

@login @pass
Scenario Outline: Login with valid username and password
    Given I am on the Base Page
    And I navigate to Login Page
    And I enter username as "alice"
    And I enter password as "mypassword"
    And I login
    Then I should see success message as "You are logged in as alice"
