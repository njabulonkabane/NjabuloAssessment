Feature: User buys all desktops after logging in

  As a logged-in user
  I want to click on the "Desktops" section and purchase all available desktops
  So that I can buy all desktops in one go without selecting each individually

  Scenario Outline: User logs in and buys all desktops
    Given user navigates to <url>
    And I go to the registration page
    When enter registration information and submit
    Then I click on computer tab and go to desktops option
    When I add all the desktops and validate the price
    Then I remove one item and valid the price
    And I checkout and valid checkout
    Then fill all the information for checkout  <countryCode>
    And I navigate to my account
    Then Verify that the order is created successful

    Examples:
      | url                                | email | password         | countryCode|
      | https://demowebshop.tricentis.com/ | nnjabulo@gmail.com | Password=01|3    |

