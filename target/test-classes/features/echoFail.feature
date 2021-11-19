Feature: BrowserStack Echo Fail Feature

@echo @fail
Scenario Outline: Enter text to be displayed on screen and fail scenario
    Given I am on the Base Page 
    And I navigate to Echo Box
    And I enter "This is BrowserStack Echo"
    And I submit
    Then it should pass and show message as "This is not a BrowserStack Echo"