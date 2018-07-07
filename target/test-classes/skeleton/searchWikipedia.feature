@web
@ignored
Feature: search Wikipedia

#  @ignored
  Scenario Outline:
    Given Enter search term '<searchTerm>'
    When Do search
    Then Search results are shown for '<result>'

    Examples:
      | searchTerm | result                |
      | mercury    | Mercury usually refers to: |
      | max        | Max or MAX may refer to:     |
