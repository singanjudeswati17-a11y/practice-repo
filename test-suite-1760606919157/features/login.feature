Feature: Login to vastu web

@smoke
Scenario: login Feature
And enter "user_4650@vastuhfc.com" into "Email"
And enter "123456" into "Password"
And click on the 2nd "Login"
And wait 5 sec

@smoke
Scenario: Tab Fuctinalility
And click "Dashboard"
And click "Credit"
And wait 3 sec
And right click "Overview"
And wait 5 sec
And click "Overview"

@smo
Scenario: Tab Fuctinalility1
And switch to main tab
And check that screen does not contain "Application Stages Dashboard"
And wait 2 sec
And switch to last opened tab
And click "Manager Wise"
And switch to main tab

@smo
Scenario: verify Dashboard
And check that screen contains "Gmail Batch Update"
And check that button "Gmail Batch Update" is enabled
And wait 3 sec
And check that screen contains "Sales"
And wait 3 sec
And click "Sales"
And check that screen contains "Login Stage" with exact phrase
And wait 3 sec
And click "Sales"

@sani
Scenario: verify  search
And check that screen contains "Search"
And check that button "Search" is enabled
And enter "h" into "Search"
And wait 3 secs
And check that screen contains "Loan No"
And wait 3 sec
And scroll down until screen contains "Admin"
And wait 3 sec
And scroll up until screen contains "Gmail Batch Update"
And wait 3 sec


@sani
Scenario: Verify Search fuctinality
And check that screen contains "2025-04-15" and save it as "Date"
And wait 3 sec
And enter "{Date}" into "Search"
And wait 2 sec
And check that screen contains "HL0000000083079"


@smo
Scenario: verify Dashboard Items
And check that screen contains following
|Applications|
|Search|

@smok
Scenario:Verify Scroll
And scroll up until screen contains "Gmail Batch Update"
And wait 3 sec
And check that screen contains following
|Loan No|
|Branch|
|Loan Type|
And wait 3 sec












