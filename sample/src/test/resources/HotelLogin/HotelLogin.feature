#Author: Vamshidhar Thonti
Feature: login
Description: This is related to user login page for Hotel booking application

Scenario: Check the heading of the login page
Given User is in login page
Then Check the heading of the page

Scenario: Successful login on entering valid credentials
Given User is in login page
When User enters valid username and password and clicks on login button
Then Hotel booking page should be displayed

Scenario: Failured login on entering invalid username and password
Given User is in login page
When User enters invalid username and password and clicks on login button
Then Error message should be displayed as invalid username and password

Scenario: Failured login on entering either invalid username or invalid password
Given User is in login page
When User enters either invalid username or password
Then Error message should be displayed as invalid username or password

Scenario: Failured login on leaving username and password as blank
Given User is in login page
When User does not enter neither username nor password
Then Error message should be displayed as fields are empty