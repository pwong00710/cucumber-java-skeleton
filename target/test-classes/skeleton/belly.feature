Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my 'big' belly
    When I wait 1 hour
    Then my belly should growl
