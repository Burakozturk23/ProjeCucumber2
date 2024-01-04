Feature:  Product purchase Functionality

  Background:
    Given  Navigate to bank
    When Click on the element in the LoginPage
    Then Enter email and password and click signin button

    Scenario: Purchase a Product
      And Select a product
      And Add to Cart and click Shopping Cart
      And Proceed to Checkout
      And Success message should be displayed