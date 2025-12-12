Feature: Credit feature
@Functional
Scenario: Login scenario
And click "Allow" inside span
And wait 2 sec
And enter "gaurav.g@vastuhfc.com" into "Enter your email"
And enter "Vastu@123" into "Enter your password"
And wait 3 sec
And click "Sign in"
  
@Functional
Scenario: Credit scenario
And click "Credit" inside span
And click on the 2nd "Loan Detail"
And click on the element with class "anticon anticon-eye view_button_loan_list"
And check that screen contains "HL0000000084119"
And click " View Detailed Progress "
And check that screen contains "Application Stages"

@Functional
Scenario: Lead scenario
And click "stage_icons"

