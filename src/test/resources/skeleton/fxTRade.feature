Feature: FxTrade

  Scenario: Book an FX Trade
    Given trades with the following details are created:
      |buyCcy |sellCcy |amount   |date       |
      |EUR    |USD     |12345.67 |2017-11-23 |
      |GBP    |EUR     |67890.12 |2017-11-24 |
    When the trades are executed
    Then the trades are confirmed
