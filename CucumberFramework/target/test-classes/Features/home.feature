Feature: check the homepage functionality

  Background: login to homepage with valid username and password
    Given navigate to login page
    When user enters the username
    And user enters the password
    And user clicks on the login button
    Then user should navigate to homepage

  @smoke
  Scenario: check the logout button is showing
    When user click on the react menu
    Then logout button should displayed
    And exit the browser

  @functionality
  Scenario: check the cart badge is showing number
    When user clicks on the add to cart button
    Then cart badge should show the number
    And exit the browser
