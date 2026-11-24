Feature: Dashboard - Employee hours aggregation based on selected period

  Background: User is on login page
    Given User launches application
    And click on continue with microsoft account
    #And enter email and click on next
    #And enter password and click in 'signIn'
    #And select yes to login
    Then User should login successful


  Scenario Outline: Verify employee hours aggregation based on selected period

    Given User is on the Dashboard page
    When User searches for the project "<ProjectName>"
    And User opens the selected project
    And User searches for the employee "<EmployeeName>"
    And User selects the start date "<StartDate>"
    And User selects "<Period>" from the Period dropdown
    Then Employee end date should be "<ExpectedEndDate>"
    And Employee total hours should be aggregated according to the selected "<EmployeeName>"

    Examples:
      | ProjectName        | EmployeeName                   | StartDate   | Period    | ExpectedEndDate |
      | Mahindra           |Swati Yashwant Singanjude      | 01/01/2026  | Monthly   | 31/02/2026      |
      | Mahindra          |Swati Yashwant Singanjude      | 01/01/2026  | Quarterly | 30/03/2026      |
      | Mahindra          |Manthena Siva Rama Raju       | 01/01/2026    | Yearly     | 31/12/2026     |