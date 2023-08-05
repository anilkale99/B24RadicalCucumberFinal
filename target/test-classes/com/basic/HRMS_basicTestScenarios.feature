Feature: This file contains test scenarios of add employee

  Scenario: 1.Validate New employee getting created and searched in HRMS System
    Given Login with admin user
    When Go to PIM Tab
    Then validate user gettting searched


  Scenario: 2.validate employee not getting created if mandatory fields missing.
    Given Login with admin user
    When Go to PIM Tab
    Then validate user Not gettting searched.

