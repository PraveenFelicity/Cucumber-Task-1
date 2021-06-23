#Author: Praveen@your.domain.com
Feature: Validating add customer flow

  Background: 
    And user click on add customer button

  Scenario: Add Customer validation
    #Given user launches telecom application
    When user need to fill up the fields
    And user click on submit button
    Then user verify customer id is generated
    
@OneDimList
  Scenario: Add Customer validation by 1D list concept
    When user need to fill up the fields by oneDim list
      | Stranger | Things | will@gmail.com | houstan | 78945687 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add Customer validation by 1D map concept
    When user need to fill up the fields by oneDim map
      | Fname    | Stranger       |
      | LName    | Things         |
      | Mail     | will@gmail.com |
      | address  | houstan        |
      | PhoneNum |       78945687 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add Customer validation by 2D list concept
    When user need to fill up the fields by TwoDim list
      | Stranger | Things | will@gmail.com   | houstan   | 78945687 |
      | Mike     | Things | Mike@gmail.com   | Texas     | 78945687 |
      | Dustin   | Things | Dustin@gmail.com | Las Vegas | 78945687 |
      | Lucas    | Things | Lucas@gmail.com  | Brimgham  | 78945687 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add Customer validation by 2D map concept
    When user need to fill up the fields by TwoDim map
      | Fname    | Lname  | mail             | Addres    | Phne     |
      | Mike     | Things | Mike@gmail.com   | Texas     | 78945687 |
      | Dustin   | Things | Dustin@gmail.com | Las Vegas | 78945687 |
      | Lucas    | Things | Lucas@gmail.com  | Brimgham  | 78945687 |
      | Stranger | Things | will@gmail.com   | houstan   | 78945687 |
    And user click on submit button
    Then user verify customer id is generated
