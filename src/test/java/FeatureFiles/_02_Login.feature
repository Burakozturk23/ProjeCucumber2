Feature: Login Functionality

  Background:
    Given  Navigate to bank

  Scenario: Login
    When Click on the element in the LoginPage
    Then Enter email and password and click signin button
    And Success message should be displayed