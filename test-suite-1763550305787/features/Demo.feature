Feature:Drag
@Demo
Scenario: First scenario
And click "Alerts, Frame & Windows"
And wait 2 sec
And click "Interactions"
And wait 2 sec
And click "Dragabble"
And wait 2 sec
And drag "Drag me" and drop it on "Axis Restricted"
And wait 5 sec

@Demo
Scenario: Second scenario
And click "Cursor Style"
And drag "I will always stick to the center" and drop it on "My cursor is at bottom"
And wait 5 sec

@Demo
Scenario: Third scenario
And click "Droppable"
And click "Accept"
And drag "Acceptable" and drop it on "Drop here"
And hover over "Not  Acceptable" with exact phrase
And wait 5 sec
And drag "Not  Acceptable" and drop it on "Drop here"
And wait 5 sec

