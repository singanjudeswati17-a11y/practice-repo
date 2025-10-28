Feature:API

@api
Scenario: First scenario
And compose a get request to "https://postman-echo.com/get?foo1=bar1&foo2=bar2" with headers
|Cookie|__cf_bm=0YwjBACSN5MBoyBaFbD_B7XTe2FwQsL0xrBXUZII4YU-1761552418-1.0.1.1-fKRyHRKjGnYQqsqF8Ba7Hm6xmCPwavJ4z8p8IxpSVvWuaLGYUwHClrJZgZ4drLEZw_KznIWeAYX6s8IcCoCNyEm302llwJjRbjzf1etkbdU; _cfuvid=K0OW5VYBGFX8vbiTq9kvlsn1jivLxW3e2nQhMkQbe8I-1761552418807-0.0.1.1-604800000; sails.sid=s%3AHa8BX3vtTzbEkGSDd1bptFFFRHG0mfrr.ngZhe1%2BAhbufO1BKHDpq1VfK8HFkr10aV0rNULNje7I|
And execute and save the response as "apiResponse"
And check that response {apiResponse} has "200" as status code

@api
Scenario: Second scenario
And compose a post request to "https://jsonplaceholder.typicode.com/posts" with headers
|Content-Type|application/json|
And with the below JSON request
"""
{
"title": "foo",
"body": "bare",
"userId": 1
}
"""
And execute and save the response as "api__response"
And check that response {api__response} has "201" as status code
And check that API response {api__response} contains "foo" at "$.title"


