Feature: BrowserStack Echo Feature

@echo @pass
Scenario Outline: Enter text to be displayed
    Given I am on the Base Page 
    And I navigate to Echo Box
    And I enter "This is BrowserStack Echo"
    And I submit
    Then it should pass and show message as "This is BrowserStack Echo"