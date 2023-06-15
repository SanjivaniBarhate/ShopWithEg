Feature: Verify login

Scenario: Verify user is logged in with valid credentials


Given user launches Shopping Site
When user enters valid credentials
And user clicks on login button
Then landing page will be displayed

