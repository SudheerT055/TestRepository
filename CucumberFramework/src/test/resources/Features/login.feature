Feature: check the login page with username and password

  #@smoke
  #Scenario: check the login page with valid username and password
    #Given navigate to login page
    #When user enters the username
    #And user enters the password
    #And user clicks on the login button
    #Then user should navigate to homepage
    #And exit the browser

  @functionality
  Scenario: check the login page with invalid username and valid password
    Given navigate to login page
    When user enters the invalid username
    And user enters the password
    And user clicks on the login button
    Then user should see the error message
    And exit the browser

  @functionality
  Scenario: check the login page with valid username and invalid password
    Given navigate to login page
    When user enters the username
    And user enters the invalid password
    And user clicks on the login button
    Then user should see the error message
    And exit the browser

  @functionality
  Scenario: check the login page with empty username and empty password
    Given navigate to login page
    When user enters the empty username
    And user enters the empty password
    And user clicks on the login button
    Then user should see the error message
    And exit the browser
