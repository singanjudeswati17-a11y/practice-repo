@view_loan_details @regression @lms_regression
Feature: Credit feature
Scenario: Login scenario
{module:LMS_Login(lms_username="gaurav.g@vastuhfc.com", lms_password="Vastu@123")}

Scenario: View Detailed scenario
{module:LMS_view_details(LAN_value="value")}

Scenario: Lead scenario
And click "View Detailed Progress "
And check that screen contains "Application Stages"
And check that screen contains "Lead"
And check that screen contains "Loan Application Progress"
And click on the element with class "stage_icons"
And wait 2 sec
And click on the element with id as "assign_to"
And click "Harshal Sawant (EMP54605)"
And click on the element with id as "queries_0_sub_section"
And click "Add Customer"
And click on the element with id as "queries_0_customer_type" 
And click "Co-Applicant"
And click on the element with id as "queries_0_reason"
And click "Female customer not present in case"
And click "KYC"
And click "Submit"




