Feature: Project Management

  Background: User is on login page
    Given User launches application
    And click on continue with microsoft account
    #And enter email and click on next
    #And enter password and click in 'signIn'
    #And select yes to login
    Then User should login successful

  Scenario: Create a new project successfully
    Given User create new project page
    When User fills new project details
    And User saves the project
    Then New project should be created successfully

  Scenario: While cancel project , new project creating failed.
    Given User create new project page
    When User fills new project details
    And User cancel the project
    Then New project should not be created.

  Scenario: Employee is removed from the project successfully
    Given User is on the Project page
    When User clicks on the Action menu for the project
    And User clicks on "Manage Members"
    And User searches for the employee username
    And User deselects the employee checkbox
    And User clicks on the Update Members button
    Then Employee should be removed from the project successfully

