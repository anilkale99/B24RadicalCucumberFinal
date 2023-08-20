
Feature: testing hooks in cucumber

  @first @regression
  Scenario: 1.checking hooks concept in cucumber
    Then my first step
    Then my second step
    Then my third step
    
  @second @smoke
  Scenario: 2.checking hooks concept in cucumber
    Then my first step
    Then my second step
    Then my third step
    
  @third
  Scenario: 3.checking hooks concept in cucumber
    Then my first step
    Then my second step
    Then my third step
     
  