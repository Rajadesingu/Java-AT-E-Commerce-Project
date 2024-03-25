Feature: search for and add an item to the shopping cart Functionality 

Scenario: Search for and add an item to the shopping cart 
	Given Launch the URL for search 
	When Navigate the search 
	And Enter the product name and search 
	And Select the product and add to cart 
	Then Validate the add on product in shopping cart 
	