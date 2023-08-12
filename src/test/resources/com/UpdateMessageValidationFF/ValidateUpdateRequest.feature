
Feature: valdiate POST request with update
 
    Scenario: 1.Validate you are able to create data in system
    Given update the data to create user 
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    
    Scenario: 2.Validate you are able to create user from File
    Given update the data to create user from file
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    
    
    Scenario: 3.Validate you are able to create user from update File with name field
    Given update the data to create user from file with updated name
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    
    Scenario: 4.Validate you are able to create user from update File with name field
    Given update the data to create user from file with updated fields
    |name|
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    
    
    Scenario: 5.Validate you are able to create user from update File with name field
    Given update the data to create user from file with updated fields
    |name|
    |job|
    |mob|
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    
    
    #Scenario: 2.Validate you are able to create data and validate date in response
    #Given post the data to create user 
    #Then validate status code is "201"
    #Then validate date is todays date
    #
     #Scenario: 3.Validate you are able to create user with name as only number 
    #Given post the data to create user 
    #Then validate status code is "201"
    #Then validate date is todays date
    #
    #
    #Scenario: 4.Validate you are able to create user with name as only character 
    #Given post the data to create user 
    #Then validate status code is "201"
    #Then validate date is todays date
    #
      #Scenario: 5.Validate you are able to create user with name as only character and special char 
    #Given post the data to create user 
    #Then validate status code is "201"
    #Then validate date is todays date
    
    
  