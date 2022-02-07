Feature: User is able to login with valid username & password

Description: "User login to zoopla website and verify login"

Scenario Outline: User login with valid username and verify page title
Given User can open any browser
And User is able to enter url "https://www.zoopla.co.uk/" 
When User clicks on the Login in button
And User enters email "<username>" and password "<password>"
And User clicks on Sign in button
Then User is able to verify successful login & verify page title

Examples:
|Username            |Password  |
|huque.mir@gmail.com |123456    |
|huque.mir@gmail.    |1234567   |
|huque.mir@gmail.c   |12345678  |
|huque.mir@gmai      |123456789 |
|huque.mir@g         |1234567890|
