Feature: Shoppingcart

  Scenario: checkout a cart in 10 secs
    Given I have 28 items in my shoppingcart
    When I wait 10 seconds
    Then my shoppingcart should be READY
