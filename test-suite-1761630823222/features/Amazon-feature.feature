Feature:Amazon feature

Scenario: Verify Amazon Page
@smoke
Scenario: amazon page verify
And check that screen contains "Cart"
And check that screen contains "Search Amazon.in"
And check that screen contains "Account & Lists"

@smoke
Scenario: Search Functionality verify
And check that button "Search Amazon.in" is enabled
And enter "Phone" into "Search Amazon.in"
And click on the element with id as "nav-search-submit-button"
And wait 3 sec
And check that screen contains "Sponsored"

Scenario: phone 
And check that screen contains "Sort by"
And click "Sort by"


@smoke
Scenario:add to cart Functionality verify
And scroll down until screen contains "Nothing Phone"
And wait 5 sec
And click "Add to cart"
And wait 5 sec
And scroll up until screen contains "Cart"
And click "Cart"
And wait 3 sec
And check that screen contains "Nothing Phone"


@smoke
Scenario:Go to All Functionality
And check that screen contains "All"
And click "All"
And wait 3 sec
And click "Bestsellers"
And check that screen contains "Amazon Bestsellers"


Scenario: phone 
And check that screen contains "Sort by"
And click "Sort by"


  