Feature: Validation of 	Login Page in Adactin Hotel Web Application

  Background: 
    Given User launch Adactin Hotel Web Application

  Scenario: TC01_Validation of Login Page with Valid Username and Valid Password
    Given User launch Adactin Hotel Web Application
    When User Enters Valid Username and Valid Password
    And User Click Login Button
    Then User Verify Search Hotel Page is Displayed
    When User Enter Valid Location, Valid Hotels, Valid Room Type, Valid Number of Rooms, Valid Check In Date, Valid Check Out Date
    And User Click Search Button
    Then User Verify Select Hotel Page in Displayed
    When Click Radio Button and User Click Continue
    Then User Verify Book a Hotel Page is Displayed
    When User Enter Valid First Name, Valid Last Name and Valid Billing Address
    When User Enter Valid Credit Card no and Select Valid Card Type, Select Valid Month, Select Valid Year, Enter Valid CVV Number
    And User Click Book Now Button
    Then User Verify Booking Confirmation Page is Displayed and Conformation Order Id is Showned

  Scenario Outline: TC02_Validation of order Id With Multiple Data
    When User Enters "<Username>", "<Password>"
    And User Click Login Button
    Then User Verify Search Hotel Page is Displayed
    When User Enter Valid "<Location>", select "<Hotels>", select "<Room Type>", select "<Number of Rooms>", User Enter Valid "<Check In Date>" and "<Check Out Date>", select "<Adults Per Room>" and "<Children Per Room>"
    And User Click Search Button
    Then User Verify Select Hotel Page in Displayed
    When Click Radio Button and User Click Continue
    Then User Verify Book a Hotel Page is Displayed
    When User enter valid "<First Name>", valid "<Last Name>", and valid "<Billing Address>" and valid "<Credit Card no>"
    When User select valid "<Card Type>", valid "<Month>", valid "<Year>" and user enter "<CVV Number>"
    And User Click Book Now Button
    Then User Verify Booking Confirmation Page is Displayed and Conformation Order Id is Showned

    Examples: 
      | Username     | Password | Location | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room | First Name   | Last Name | Billing Address | Credit Card no   | Card Type | Month   | Year | CVV Number |
      | Dhanasekaran | dhana@99 | Sydney   | Hotel Creek    | Deluxe    | 1 - One         | 02/03/2022    | 04/03/2022     | 2 - Two         | 2 - Two           | Dhanasekaran | A         | Kumbakonam      | 2005990505992307 | VISA      | August  | 2022 |       5439 |
      | Dhanasekaran | dhana@99 | London   | Hotel Sunshine | Deluxe    | 1 - One         | 03/03/2022    | 06/03/2022     | 2 - Two         | 2 - Two           | Suryaprasad  | A         | Chennai         | 1234567823451234 | VISA      | January | 2022 |       1356 |
      | Dhanasekaran | dhana@99 | Paris    | Hotel Hervey   | Standard  | 1 - One         | 04/03/2022    | 05/03/2022     | 2 - Two         | 2 - Two           | Prabakar     | P         | Thirunelveli    | 1234567845678901 | VISA      | June    | 2022 |       1454 |
      | Dhanasekaran | dhana@99 | New York | Hotel Sunshine | Double    | 1 - One         | 04/03/2022    | 06/03/2022     | 2 - Two         | 2 - Two           | Aswin        | R         | Trichy          | 1234567887654321 | VISA      | May     | 2022 |       7834 |
