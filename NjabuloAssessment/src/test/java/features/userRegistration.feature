Feature: User Registration
  As a new user,
  I want to be able to register an account,
  So that I can access the platform and use its features.

  Scenario Outline: Successful user registration with valid details
    Given user navigates to <url>
    And I go to the registration page
    When  enter registration information and submit
    Then I should be redirected to the dashboard page

    Examples:
    | url|
    |  https://demowebshop.tricentis.com/  |

