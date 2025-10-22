Feature:API
@api
Scenario: First scenario
  # Start typing steps below.
And compose a post request to "https://test-aws-web.vastucorp.com/api/sales_timesheet_view" with headers
And |stagingtoken|9e107d9d372bb6826bd81d3542a419d6|
And with the below JSON request
And """
And {
 And "username": "user_15@vastuhfc.com",
And "password": "123456",
And "deviceid": "b401d05b86dd2f95",
And "version": "3.2.9",
And "app_name": "pulse_app",
And "userid": "15" 
And }
And """
And execute and save the response as "API__response"
And check that variable {API_response} is equals to "completed" with exact phrase
And check that response {API_response} has "200" as status code
  

