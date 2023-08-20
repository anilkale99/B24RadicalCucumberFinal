
Feature: valdiate Get request

  Scenario: 1.Validate Demo QA up and running1
    Given hit the URI
    Then validate title "Git Pocket Guide" and pages "234" of application
    
  Scenario: 2.Validate Demo QA up and running2
    Given hit the URI
    Then validate value for "books[0].title" is "Git Pocket Guide"
    Then validate value for "books[0].pages" is "234" 
    Then validate value for "books[0].author" is "Richard E. Silverman" 
    Then validate value for "books[0].publisher" is "O'Reilly Media" 
    Then validate value for "books[1].title" is "Learning JavaScript Design Patterns"
    Then validate value for "books[2].title" is "dfsdafdsa fddsf sda" 
     
   Scenario: 3.Validate Demo QA up and running3
    Given hit the URI
    Then validate value for attribute "title" is "Git Pocket Guide" present in response
    
    
    Scenario: 4. Validate Demo QA up and running3
    Given hit the URI
    Then validate value for attribute "author" is "Axel Rauschmayer" present in response 
    
   
    Scenario Outline: 5.Validate data with datadrive testing
    Given hit the URI
    Then validate value for <jsonPath> is <Value>
    Examples:
			    |jsonPath							|Value														    |
			    |'books[0].title'			|'Git Pocket Guide'								  |
			    |'books[0].pages'			|'234'															|
			    |'books[0].author'		|'Richard E. Silverman'							|
			    |'books[0].publisher'	|"O'Reilly Media"										|
			    |'books[1].title'			|'Learning JavaScript Design Patterns'|
			    |'books[2].title'			|'dfsdafdsa fddsf sda'						   |
			    
