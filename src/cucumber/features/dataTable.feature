Feature: Practice of from http://www.thinkcode.se/blog/2014/06/30/cucumber-data-tables 

Scenario: The sum 
    Given a list of numbers 
        | 1  |
        | 1  |
        | 1  |
    When I summarize them 
    Then should I get 3 
    
Scenario: Cucumber can convert a Gherkin table to to a map. 
    This an example of a simple price list. A price list can be represented as price per item 
    Given  the price list for a coffee shop 
        | coffee | 1 |
        | donut  | 2 |
    When  I order 1 coffee and 1 donut 
    Then  should I pay 3 
    
    
    
Scenario: Cucumber can convert a Gherkin table to to a map. 
    This an example of a more complicated price list. An international coffee shop must handle currencies
    Given the price list for an international coffee shop 
        | product | currency | price |
        | coffee  | COL      | 5     |
        | donut   | ARG      | 18    |
    When I buy 1 coffee and 1 donut 
    Then should I pay 5 COL and 18 ARG 
    
Scenario: Verify Line of invoice 
    Given the 