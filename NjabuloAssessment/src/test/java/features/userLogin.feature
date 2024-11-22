Feature: User Login
  Test that the user can login and access the shop

  Scenario Outline: User Login
    Given user navigates to <url>
    When I go to the login page
    And login with valid <email> <password>
    Then the user should be able logged in

    Examples:
      | url                                | email | password         |
      | https://demowebshop.tricentis.com/ | nnjabulo@gmail.com | Password=01      |