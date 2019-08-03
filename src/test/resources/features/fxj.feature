Feature: Download FX rates

  Scenario: Single FX rate
    Given An instance of FXJ
    When  Requested for JPY
    Then A value is returned

  Scenario: FX pair rate
    Given An instance of FXJ
    When Requested for USDJPY
    Then A value is returned

  Scenario: All the daily rates
    Given An instance of FXJ
    When Requested for all daily rates
    Then A list of rates is returned

  Scenario: All the historical rates
    Given An instance of FXJ
    When Requested for all historical rates
    Then A list of rates is returned

  Scenario: Rates for the a date
    Given An instance of FXJ
    When Requested for rates for a date
    Then A list of rates is returned

  Scenario: Get rates for current date when no date is given
    Given An instance of FXJ
    When Requested for rates for an empty date
    Then A list of rates is returned
    And It is same as the list of daily rates

  Scenario:  Rates for future date
    Given An instance of FXJ
    When Requested for rates for a date in future
    Then A NaN rate is returned