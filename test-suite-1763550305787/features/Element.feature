Feature: Different Element

@element
Scenario: First scenario
And click "Elements"
And click "Text Box"
And wait 3 sec
And enter "swati" into the 2nd "Full Name"
And wait 3 sec
And enter "disha@dk.com" into "name@example.com"
And enter "vk road Mumbai" into the 2nd "Current Address"
And click "Submit"

@element
Scenario: Form scenario
And click "Forms"
And click "Practice Form"
And enter "swati" into "First Name"
And enter "singh" into "Last Name"
And enter "hyj@jkh.com" into "name@example.com"
And enter "9865324567" into "Mobile Number"
And click on the element with id as "dateOfBirthInput"
And click "20"
And click "Select State"
And click "Haryana"
And wait 3 sec
And click "Submit"
