Feature: Admin Reports

  Background: User is on login page
    Given User launches application
    And click on continue with microsoft account
    Then User should login successful

  @CompleteReport
  Scenario: Download Complete Report
    Given User is on Admin Report page
    When User clicks Download Complete Report
    Then Report should be downloaded successfully


  @WeeklyReport
  Scenario: Download Complete Weekly Report
    Given User is on Admin Report page
    When User selects report date range
    And User clicks Download Complete Weekly Report
    Then Report should be downloaded successfully


  @ProjectReport
  Scenario: Download Project Report
    Given User is on Admin Report page
    When User searches for project "Mahindra"
    And User selects report date range
    And User clicks Project Download Report
    Then Report should be downloaded successfully


  @ProjectWeeklyReport
  Scenario: Download Project Weekly Report
    Given User is on Admin Report page
    When User searches for project "Mahindra"
    And User selects report date range
    And User clicks Project Weekly Report
    Then Report should be downloaded successfully