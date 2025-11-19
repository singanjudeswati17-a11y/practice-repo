Feature: Login to vastu web

@smoke
Scenario: login Feature
And enter "user_4650@vastuhfc.com" into "Email"
And enter "123456" into "Password"
And click on the 2nd "Login"
And wait 5 sec

@smoke
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

@sanity
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


@sanity
Scenario: Verify Search fuctinality
And check that screen contains "2025-04-15" and save it as "Date"
And wait 3 sec
And enter "{Date}" into "Search"
And wait 2 sec
And check that screen contains "HL0000000083079"


@issue
Scenario: verify Dashboard Items
And check that screen contains following
And |Applications|
And |Search|

@issue
Scenario:Verify Scroll
And scroll up until screen contains "Gmail Batch Update"
And wait 3 sec
And check that screen contains following
And |Loan No|
And |Branch|
And |Loan Type|
And wait 3 sec










