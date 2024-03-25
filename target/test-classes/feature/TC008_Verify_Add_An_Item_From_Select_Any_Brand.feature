Feature: Add item from Menu to Brands 

Scenario: Select and add an item from Menu to Brands 
	Given Launch the URL for brands 
	When Navigate the shop by brands menu 
	And Select the brand and add on item to cart 
	Then Validate the add on item in shopping cart