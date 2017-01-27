Feature: Practice of from http://www.thinkcode.se/blog/2014/06/30/cucumber-data-tables

Scenario: The sum
    Given a list of numbers
     | 111  |
     | 55   |
     | 123  |
    When I summarize them
    Then should I get 289
