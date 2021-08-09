@test
Feature: Access to CGS Salesforce website
  Use selenium java with cucumber-jvm and navigate to CGS Salesforce Website

  Scenario: User Authentication
    Given user visit CGS salesforce site
    When user enter user id and password
    And user click on login button
    Then user logs into the CGS site
    And user clicks on Sign In button
    
    
