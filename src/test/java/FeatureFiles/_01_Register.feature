Feature: Register Functionality

  Scenario: Register
    Given Navigate to bank

    When Click on the element in the RegisterPage
      |registerButton  |

    Then User sending  the keys in RegisterPage
    |firstName  | Burak  |
    |lastName  | Kartal  |
    |email  | burak23@domain.com  |
    |password  | Burak.123  |
    |confirm  | Burak.123  |

    And Click on the element in the RegisterPage
      |createButton  |

    And Success message should be displayed

