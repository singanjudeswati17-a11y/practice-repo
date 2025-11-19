Feature: Frames and Windows

@demo
Scenario: Switch to frame
And click "Alerts, Frame & Windows"
And wait 5 sec
And click "Frames"
And check that screen contains "Sample Iframe page There are 2 Iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame, which is this window, and the two frames below"
And wait 2 sec
And switch to the 4th frame
And wait 3 sec
And check that screen contains "This is a sample page"

@demo
Scenario: Switch to frame sc1
And switch to parent frame
And check that screen contains "This is a sample page"

@demo
Scenario: Switch to frame
And click "Nested Frames"
And switch to the 4th frame
And check that screen contains "Parent frame" with exact phrase
And wait 2 sec
And switch to child frame
And check that screen contains "Child Iframe"
And wait 2 sec
