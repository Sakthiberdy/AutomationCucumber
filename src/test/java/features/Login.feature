Feature: Application Login

  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with "jin" and "1234"
    Then Homepage is populated
    And Cards displayed are "true"

  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with "john" and "4321"
    Then Homepage is populated
    And Cards displayed are "false"