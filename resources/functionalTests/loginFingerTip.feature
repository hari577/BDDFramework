#Author: Jyothi G

@fingerTipLogin
Feature: Fingertip Login test cases

  @login
  Scenario: Validate login functionlity
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    
    
    @Invalidlogin 
  Scenario: Validate login functionlity
    Given user launches Url of fingertip
    And user enters invalid username and password
    And user click on login button
    Then user validate whether login is successful or not
    