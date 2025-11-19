Feature: EasyMyTrip feature

@Fun
Scenario: verify elements on screen
And check that screen contains following and save it as "Headers"
|Flights|
|hotel|
|Trains|
|Activities|
|Bus|
|Gift Cards|

@Functional
Scenario: verify elements on screen
And click on the element with class "eb_widget_welcome_text"
And wait 2 sec

@Functional
Scenario: verify elements on screen
And click on the element with class "_rohChatAI play"

@Fun
Scenario: Set Trip 
And check that screen contains "From"
And click "From"
And wait 2 sec
And scroll down until screen contains "Bangkok(BKK)"
And click "Bangkok(BKK)"
And wait 2 sec
And enter "Singapore"
And wait 10 sec
And click "Singapore(SIN)"
And wait 3 sec
And click "Nov 2025"

@Fun
Scenario:set date
And click on the 5th child with class "bor-d31"
And wait 2 sec

@Fun
Scenario:set Return date
And click "Return Date" inside p
And click on the 5th child with class "bor-d61"
And wait 2 sec

@Fun
Scenario:Schedule trip
And double click "Traveller & Class"
And wait 2 sec
And check that screen contains following
|Adults|
|Children|
|Infant|
|Economy|
|Premium Economy|
And click "+"
And wait 2 sec
And click "Premium Economy" inside label
And check that radio button "Premium Economy" is selected
And click "Done"
And wait 2 sec

@Fun
Scenario:Verify Schedule trip
And check that screen contains following
|2|
|Travellers|
|Premium Economy|
And wait 2 sec
And click "Students"
And check that checkbox "Students" is checked
And wait 2 sec

@Fun
Scenario: Serch
And click on the element with class "srchBtnSe"
And wait 2 sec


Feature: MakeMyTrip 

@Feature
Scenario: First scenario
And click on the element with class "commonModal__close" at index 1
And wait 2 sec
And click "Search" inside a
And wait 10 sec


