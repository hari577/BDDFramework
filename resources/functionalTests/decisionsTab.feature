#Author:Jyothi G

@fingerTipDecisions
Feature: Fingertip Decisions test cases

  @decisiontestcase1
  Scenario Outline: Test case to validate title and description
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                     | Description          |
      | xx_test_title_description | Test description xx1 |

  @decisiontestcase2
  Scenario Outline: Test case to validate title and no description
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And I click on share button
    Then user validate "Please enter description" error message

    Examples: 
      | Title                     |
      | xx_test_title_description |

  @decisiontestcase3
  Scenario Outline: Test case to validate no title and description
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Description>" in decision page
    And I click on share button
    Then user validate "Please fill the decision title" error message

    Examples: 
      | Description          |
      | Test description xx1 |

      @decisiontestcase4
  Scenario Outline: Test case validate whether decision created successfully
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "Today" in date picker
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_1_jyothi | Test description xx1 | 
      
   @decisiontestcase5
  Scenario Outline: Test case validate whether decision created successfully
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "1/MAY/2019" in date picker
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_1_jyothi | Test description xx1 |  
      
     @decisiontestcase6
  Scenario Outline: Test case validate whether decision creted successfuly
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "31/March/2020" in date picker
    And I click on share button
    Then I vaidate text "<Title>" in Decision page
    

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_3_jyothi | Test description xx2 |   
      
   @decisiontestcase7
  Scenario Outline: Test case validate whether decision creted successfuly
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "8/APRIL/2019" in date picker
    And user selects "11:00 AM" in time section
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_3_jyothi | Test description xx2 |  
       
      @decisiontestcase8
  Scenario Outline: Test case to validate whether decision created with priority
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "Low" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |
      
      @decisiontestcase9
  Scenario Outline: Test case to validate whether decision created with priority
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "Very High" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |
         
      @decisiontestcase10
  Scenario Outline: Test case to validate whether decision created with priority
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "High" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |
               
       @decisiontestcase11
  Scenario Outline: Test case to validate whether decision created with priority
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "Normal" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |
      
             @decisiontestcase12
  Scenario Outline: Test case to validate whether decision created with priority
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate fingertip text in home page
    And Click on Decision Tab
    And Click on New button
    And User select "Decision" frm the dropdown
    And click on continue button
    And user enters "<Title>" in NewDecision page
    And user enters "<Description>" in decision page
    And user selects "VeryLow" as priority
    And I click on share button
    Then I vaidate text "<Title>" in Decision page

    Examples: 
      | Title                          | Description          |
      | xx_testdecision_check_2_jyothi | Test description xx2 |