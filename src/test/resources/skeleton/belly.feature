Feature: Belly

  Scenario: a few items
    Given I have 28 items in my shoppingcart
    When I wait 1 seconds
    Then my shoppingcart should beready
