Feature:  Add Address Functionality

  Background:
    Given  Navigate to bank
    When Click on the element in the LoginPage
    Then Enter email and password and click signin button

    Scenario Outline: Create Address
      And Enter the MyAccount Page
      And I add a new address with the following details:
        | phoneNumber   | streetAddress |  City       | State | zip | Country       |
        | <phoneNumber>  | <streetAddress> |   <City>     | <State> | <zip> | <Country> |
      And Success message should be displayed
      Examples:
        | phoneNumber       | streetAddress    | City          | State | zip      | Country          |
        | 9081230984        | 123 Main Street  | Anytown       | NY    | 12345    | United States    |
        | 4576727412        | 456 Elm Street   | AnotherCity   | CA    | 54321    | United States    |
        | 1238714771        | 789 Oak Street   | NewCity       | TX    | 67890    | United States    |






