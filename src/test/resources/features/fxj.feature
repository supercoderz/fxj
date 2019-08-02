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

  Scenario: Rates for a historical date
    Given An instance of FXJ
    When Requested for rates for a date
    Then A list of rates is returned along with the date

  Scenario: Rates for the current date
    Given An instance of FXJ
    When Requested for rates for today
    Then A list of rates is returned

  Scenario:  Rates for future date
    Given An instance of FXJ
    When Requested for rates in future
    Then An empty list is returned